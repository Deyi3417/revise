package deyi.com.revise.file;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * 将文本文件读取为字符串
 *
 * @author : HP
 * @date : 2023/3/28
 */
public class TextFileReader {
    /**
     * 从文件中获取内容
     *
     * @return
     */
    public static String readFile(String filePath) {
        // 示例需求：将src/main/resources/templates/user_data.json读出并转为map对象
        URL resource = TextFileReader.class.getClassLoader().getResource(filePath);
        URI uri;
        try {
            if (resource != null) {
                uri = resource.toURI();
                Path path = Paths.get(uri);
                byte[] bytes = Files.readAllBytes(path);
                String result = new String(bytes);
                System.out.println("result: " + result);
                return result;
            }
        } catch (Exception e) {
            throw new RuntimeException("");

        }
        return StringUtils.EMPTY;
    }

    public static String writeFile(String filePath) {
        Map<String, Object> map = new HashMap<>();
        map.put("name","suyao");
        map.put("age","20");
        map.put("job","一名优秀的人民教师");
        String willWriteMap = JSON.toJSONString(map);
        try {
            Path path = Paths.get(filePath);
            Files.write(path, willWriteMap.getBytes(StandardCharsets.UTF_8));
            return willWriteMap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }
}
