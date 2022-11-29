package deyi.com.revise.map;

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
}
