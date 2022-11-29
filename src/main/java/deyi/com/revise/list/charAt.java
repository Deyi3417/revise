package deyi.com.revise.list;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @Author HP
 * @create 2021/11/29 11:25
 */
public class charAt {
    public static void main(String[] args) {
        String name = "deyi";
        System.out.println(name.charAt(1));
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","deyi");
        jsonObject.put("age", 26);
        jsonObject.put("salary", 66.66);
        jsonArray.add(jsonObject);
        System.out.println(jsonObject);
        System.out.println(jsonArray);

        JSONObject jsonObject1 = jsonArray.getJSONObject(0);
        System.out.println(jsonObject1);


    }
}
