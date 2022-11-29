package deyi.com.revise.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author HP
 * @create 2021/10/26 11:50
 */
public class jsonListMap {

    public static void main(String[] args) {
        //Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> list = new ArrayList<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("Thickness", 20.0);
        map.put("Material", "Q460C");
        map.put("ExMaterialID", "A110111001016");
        map.put("PlateNo", "3210814A0057");
        map.put("GroupID", "");
        map.put("NestID", "3210814A0057");
        map.put("State","I");

        List<Map<String, Object>> list02 = new ArrayList<>();
        HashMap<String, Object> map02 = new HashMap<>();
        HashMap<String, Object> map03 = new HashMap<>();
        HashMap<String, Object> map04 = new HashMap<>();
        HashMap<String, Object> map05 = new HashMap<>();
        HashMap<String, Object> mapTarget = new HashMap<>();
        map02.put("X1",32995.1518);
        map02.put("Y1",17033.3333);
        map02.put("X2",32995.1518);
        map02.put("Y2",19033.3333);
        map02.put("type","line");

        map03.put("X1",39999.1518);
        map03.put("Y1",99999.3333);
        map03.put("X2",99999.1518);
        map03.put("Y2",99999.3333);
        map03.put("type","line");

        map04.put("X1",6666);
        map04.put("Y1",7777);
        map04.put("X2",8888);
        map04.put("Y2",9999);
        map04.put("type","line");

        map05.put("X1",3232);
        map05.put("Y1",3434);
        map05.put("X2",5555);
        map05.put("Y2",5445);
        map05.put("type","line");

        list02.add(map02);
        list02.add(map03);
        list02.add(map04);
        list02.add(map05);

        mapTarget.put("SegmentList", list02);
        map.put("Plate", mapTarget);

        list.add(map);

        boolean test = test(list);
        System.out.println(test);


    }

    public static boolean test(List<Map<String, Object>> list){
        //map数量
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Map<String, Object> param = list.get(i);
            Object plate = param.get("Plate");
            System.out.println(plate);
            String s = plate.toString();
            System.out.println(s);
            int length = s.length();
            if (length == 0){
                System.out.println("运行到这里了");
                return false;
            }
            System.out.println("have a good day!");

            String nestID = (String) param.get("NestID");
            String state =(String) param.get("State");
            if (state.equalsIgnoreCase("I")){
                System.out.println("状态为:" + state);
                return true;
            }
        }
        return true;

    }




}
