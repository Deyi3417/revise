package deyi.com.revise.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author HP
 * @create 2021/11/3 11:15
 */
public class sendData {
    public static void main(String[] args) {
        JSONObject object1 = new JSONObject();
        JSONObject object2 = new JSONObject();
        JSONArray array = new JSONArray();
        Map<String, Object> params = new HashMap<>();
        params.put("requestCode", UUID.randomUUID());
        params.put("requestName","requestName");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        params.put("requestTime",sdf.format(new Date()));
        object1.put("factoryId",1);
        object1.put("requireDoneDate",sdf.format(new Date()));
        object1.put("texture","钢板");
        array.add(object1);
        object2.put("upload",34);
        object2.put("partName","构建");
        object2.put("posX",33.33);
        object2.put("posY",66.66);
        array.add(object2);
        params.put("requestData",array);
        System.out.println(params);






    }
}
