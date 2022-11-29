package deyi.com.revise.map;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author liudy23
 * @Create 2022/2/18 11:52
 * Map的覆盖一定要记得，key一致会导致覆盖，key-value是唯一标识。
 */
public class RewriteMap {
    public static void main(String[] args) {
        HashMap<String, Map<String, String>> res = MapObject();
        System.out.println("res:" + res);
        Set<String> strings = res.keySet();
        System.out.println("key:" + strings);

        Map<String, String> content = res.get("Content");
        System.out.println("content:" + content);
        HashMap<String, String> ee = getMap();
        res.put("Content2", ee);
        System.out.println("res:" + res);
    }
    private static HashMap<String, String> getMap(){
        HashMap<String, String> map = Maps.newHashMap();
        map.put("age","35");
        return map;
    }

    private static HashMap<String, Map<String,String>> MapObject(){
        HashMap<String, Map<String,String>> map = Maps.newHashMap();
        HashMap<String, String> map1 = Maps.newHashMap();
        map1.put("address", "紫云");
        map.put("Content", map1);
        return map;
    }
}
