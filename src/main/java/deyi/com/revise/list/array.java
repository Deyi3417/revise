package deyi.com.revise.list;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @Author HP
 * @create 2021/11/17 16:21
 */
public class array {
    public static void main(String[] args) {
        //获取工况-喷码，切割，分拣
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        for (int i = 0; i < 3; i++) {
            if (i == 0){
                obj.put("Load",0);
            }
            if (i == 1){
                obj.put("CutFinish",0);
            }
            if (i == 2){
                obj.put("Select1",0);
                obj.put("Select2",0);
            }
        }
        array.add(obj);
        System.out.println(array);
    }
}
