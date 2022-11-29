package deyi.com.revise.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonArr {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("luosuyao");
        user.setPassword("liudeyi");
        JSONObject jsonObject = new JSONObject();
        Map<String,String> map = new HashMap<>();
        map.put("address","hunan");
        map.put("hobby", "basketBall");
        jsonObject.put("name","deyi");
        jsonObject.put("age","18");
        jsonObject.put("other",map);
        JSONArray objects = new JSONArray();
        objects.add(jsonObject);
        System.out.println(objects);
        JSONObject jsonObject1 = objects.getJSONObject(0);
        System.out.println(jsonObject1);
        Object name = jsonObject1.get("name");
        Map<String,String> other = (Map<String, String>) jsonObject1.get("other");
        String address = other.get("address");
        System.out.println(address);
        System.out.println(name);
        String str = "";
        if (str.equals("")){
            System.out.println(str.equals(""));
        }

        List<Map<String, Object>> list = new ArrayList<>();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("user", user);
        HashMap<String, Object> newMap = new HashMap<>();
        newMap.put("address", "hunan");
        newMap.put("age", "18");
        list.add(hashMap);
        list.add(newMap);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("hobby","volleyball");
        map1.put("level", "middle");
        list.add(map1);
        list.add(hashMap);
        System.out.println(list);

        Integer a = 2;
        Integer b = 2;
        if (a.equals(b)){
            System.out.println("a = b:" + a.equals(b));
        }




    }
}
