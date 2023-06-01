package deyi.com.revise.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author HP
 * @create 2021/12/26 8:09
 */
public class nullMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("chiyan",666);
        map.put("suyao",777);
        map.put("chiyan",777);
        map.put("suyao",888);
        System.out.println(map);
        if (map.get("suyao") == null){
            System.out.println("deyi is so handsome!");
        }else{
            System.out.println("Map里面有值：" + map.get("suyao"));
            map.clear();
            System.out.println("Map清空：" + map.get("chiyan"));
        }
    }

    public void nullMap() {
        Map<String, Map<String, Object>> results = new HashMap<>();
        Map<String, Object> au = new HashMap<>();
        au = results.get("123");
        // 此处au为null,
        System.out.println(au);
        // au为null不能再添加，会报npe的错
        au.put("12",23);
        System.out.println(au);
    }

}
