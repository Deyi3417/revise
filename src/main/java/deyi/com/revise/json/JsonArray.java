package deyi.com.revise.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author HP
 * @create 2021/11/1 18:29
 */
public class JsonArray {
    public static void main(String[] args) {
        /*
        json数组，使用中括号[ ],只不过数组里面的项也是json键值对格式的
        Json对象中添加的是键值对，JSONArray中添加的是Json对象
         */
        JSONArray ja = new JSONArray();//List
        /*
         json对象，就是一个键对应一个值，使用的是大括号{ }，如：{key:value}
         Map map和json都是键值对，不同的是map中键值对中间用等号分开，
         json中键值对中间用冒号分开。其实json就是一种特殊形式的map。
         */
        JSONObject jb = new JSONObject();//Map key-value
        JSONObject jb1 = new JSONObject();//Map key-value
        jb.put("name","deyi");
        jb.put("production", 1);
        jb.put("age", 18);
        jb.put("2","shanhai");
        ja.add(jb);
        jb1.put("name1","deyi1");
        jb1.put("production1", 11);
        ja.add(jb1);
        System.out.println("jb:" + jb);
        System.out.println("jb1:" + jb1);
        System.out.println("ja:" + ja);
        System.out.println("----------");


        // testJson();
    }
    public static void testJson(){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<>();
        map.put("name","deyi");
        map.put("production", 1);
        map.put("age",18);
        map.put("2","shanhai");
        list.add(map);
        System.out.println(map);
        System.out.println(list);
    }
}
