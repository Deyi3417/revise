package deyi.com.revise.file;

import com.alibaba.fastjson.JSON;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.Map;

import static deyi.com.revise.file.TextFileReader.readFile;

/**
 * @author : HP
 * @date : 2023/3/28
 */
public class TestFile {

    public static final String TEXT_FILE_PATH = "templates/user_data.json";

    public static void main(String[] args) {
        String result = readFile(TEXT_FILE_PATH);
        System.out.println("result: " + result);
        Type type = new TypeToken<Map<String, Object>>() {
        }.getType();
        Gson gson = new Gson();
        Map<String, Object> map = gson.fromJson(result, type);
        System.out.println("map: " + map);
        for (String s : map.keySet()) {
            System.out.println("key: " + s);
            System.out.println("value: " + map.get(s));
        }

        Map<String, Object> jsonObject = JSON.parseObject(result);
        System.out.println("jsonObject: " + jsonObject);
    }

}
