package deyi.com.revise.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author HP
 * @create 2021/11/2 10:13
 */
public class ArrayJson {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        jsonObject1.put("nowCount",2);
        jsonArray.add(jsonObject1);
        jsonObject2.put("proCount",4);
        jsonArray.add(jsonObject2);
        jsonObject3.put("name","deyi");
        jsonArray.add(jsonObject3);
        System.out.println(jsonArray);
        JSONArray array = testJSON();


        Map<String, Object> map = new HashMap<>();
        map.put("production", jsonArray);
        map.put("personalInfo", array);
        System.out.println(map.toString());
    }

    public static JSONArray testJSON(){
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","dy");
        jsonObject.put("age",4);
        jsonObject.put("address","hunan");
        jsonArray.add(jsonObject);

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("code",666);
        jsonArray.add(jsonObject1);
        System.out.println(jsonArray);
        return jsonArray;


    }
}
