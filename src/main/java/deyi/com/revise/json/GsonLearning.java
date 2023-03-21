package deyi.com.revise.json;

import com.alibaba.fastjson.JSON;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.util.List;

/**
 * @author : liudy23
 * @data : 2023/3/18
 */
public class GsonLearning {
    public static final String dateString = "[2023-03-08,2023-03-09,2023-03-10]";
    public static final String dateString02 = "['2023-03-08','2023-03-09','2023-03-10']";

    public static void main(String[] args) {
        testJSON();
        testGSON();

    }
    public static void testJSON() {
        List<String> list = JSON.parseArray(dateString, String.class);
        System.out.println("JSON: " + list);
    }
    
    public static void testGSON() {

        Gson gson = new Gson();
        List<String> list = gson.fromJson(dateString02, new TypeToken<List<String>>() {
        }.getType());
        System.out.println("GSON: " + list);
    }
}
