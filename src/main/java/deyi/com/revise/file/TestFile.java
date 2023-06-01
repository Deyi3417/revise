package deyi.com.revise.file;

import com.alibaba.fastjson.JSON;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.Map;

import static deyi.com.revise.file.TextFileReader.readFile;
import static deyi.com.revise.file.TextFileReader.writeFile;

/**
 * @author : HP
 * @date : 2023/3/28
 */
public class TestFile {

    public static final String TEXT_FILE_PATH = "templates/user_data.json";
    public static final String WRITE_TEXT_FILE_PATH = "D:/tmp/usercenter/tempFile/writeTest.txt";

    public static void main(String[] args) {
        String result = readFile(TEXT_FILE_PATH);
        System.out.println("result: " + result);
        Type type = new TypeToken<Map<String, Object>>() {
        }.getType();
        Gson gson = new Gson();
        Map<String, Object> gsonMap = gson.fromJson(result, type);
        System.out.println("gson to map: " + gsonMap);

        Map<String, Object> jsonMap = JSON.parseObject(result);
        System.out.println("json to map: " + jsonMap);
        String writeResult = writeFile(WRITE_TEXT_FILE_PATH);
        System.out.println("writeResult: " + writeResult);
        String extension = WRITE_TEXT_FILE_PATH.substring(WRITE_TEXT_FILE_PATH.lastIndexOf(".") + 1);
        System.out.println("extension:" + extension);
    }

}
