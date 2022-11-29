package deyi.com.revise.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : HP
 * @date : 2022/11/3
 */
public class MapPutSameKey {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "liudy23");
        map.put("age",18);
        System.out.println(map);

        map.put("name","suyao");
        map.put("age",19);
        System.out.println("put same key: " + map);
        map.put("name","紫韵");
        map.put("address","湖南省衡阳县紫云村麻塘组");
        System.out.println("put same key and add other key: " + map);
    }
}
