package deyi.com.revise.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Set;

/**
 * @Author liudy23
 * @Create 2022/1/25 14:24
 */
public class JSONLearning {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name","deyi");
        obj.put("age",11);
        obj.put("tel","18811553417");
        System.out.println("obj:"+ obj);

        Set<String> strings = obj.keySet();
        for (String key : obj.keySet()) {
            System.out.println(obj.get(key));
        }


        System.out.println("ketSet:"+strings);

        // JSONObject转为字符串
        String s = JSON.toJSONString(obj);
        System.out.println("JSON.toJSONString:" + s);

        // JSONObject转为字符串
        String s1 = JSONArray.toJSONString(obj);
        System.out.println("JSONArray.toJSONString:" + s1);

        // JSONObject转换为字符串
        String str = obj.toJSONString();
        System.out.println("str:"+str);

        // str转换为JSON
        JSONObject jsonObject = JSONObject.parseObject(str);
        System.out.println("str-jsonObject:" + jsonObject);

        Map<String, Object> map = Maps.newHashMap();
        map.put("address","hunan");
        map.put("info","TableTennis");
        System.out.println("map:"+map);

        JSONObject objTest = new JSONObject(map);
        System.out.println("map-JSONObject:"+objTest);


    }
}
