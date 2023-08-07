package deyi.com.revise.map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : HP
 * @date : 2023/6/29
 */
public class ParseMap {
    public static void main(String[] args) {
        Map<String, Object> res = generateMap();
        Map<String, Object> dd = new HashMap<>();
        Map variable = new HashMap();
        if (res.get("variable") != null) {
            variable = JSON.parseObject(JSON.toJSONString(res.get("variable")), Map.class);
        }
        System.out.println(variable.get("name"));
        System.out.println(variable);
    }

    public static Map<String, Object> generateMap() {
        Map<String, Object> map = new HashMap();
        Map<String, Object> childMap = new HashMap();
        childMap.put("id",1);
        childMap.put("name","刘德意");
        childMap.put("age",18);
        map.put("variable", childMap);
        return map;
    }
}
