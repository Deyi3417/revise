package deyi.com.revise.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author HP
 * @create 2021/12/2 11:33
 */
public class TestMapObject {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("author", "username, password");
        map.put("address", 8888);

        System.out.println(map);

        Object authorDD = map.get("author");
        String author = String.valueOf(authorDD);
        System.out.println(author);

        String s = JSON.toJSONString(map);
        System.out.println("Stirng  s:" + s);

        JSONObject jsonObject = JSONObject.parseObject(s);
        System.out.println("JSONObject  jsonObject:" + jsonObject);
        String address = jsonObject.getString("address");
        String author1 = jsonObject.getString("author");
        System.out.println("address:" + address);
        System.out.println("author1:" + author1);


    }
}
