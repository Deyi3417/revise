package deyi.com.revise.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author HP
 * @create 2021/12/14 16:09
 */
public class keySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        map.put(666,"deyi666");
        map1.put(1,"deyi");
        map1.put(2,"deyi");
        map1.put(11,"deyi");
        map1.put(12,"deyi");
        map2.put(3,"deyi3");
        map2.put(4,"deyi4");
        map2.put(6,"deyi6");
        map = map2;
        System.out.println("map1:" + map1);
        System.out.println("map2:" + map2);
        System.out.println("map:" + map);

        Set<Integer> keys = map.keySet();
        System.out.println("key:" + keys);
        for (Integer key : keys) {
            System.out.println(key + "--" + map.get(key));
        }

//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + "-**-" + entry.getValue());
        }


    }
}
