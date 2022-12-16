package deyi.com.revise.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author : HP
 * @date : 2022/12/7
 */
public class ArraysContains {

    private static final String[] outSource = {"CEL","MIX","COA","LAM","TCL"};
    private static final String ids = "172,999,125,96";

    public static void main(String[] args) {
        ArraysContains contains = new ArraysContains();
//        contains.containsSub("MIX199505243417");
        contains.listContains();
    }

    public void listContains() {
        List<String> idList = Arrays.asList(ids.split(","));
        System.out.println(idList);
        String str = "999";
        Integer num = 999;
        if (idList.contains(str)) {
            System.out.println("不错，湘A-999QG");
        }
        if (idList.contains(num)) {
            System.out.println("可以的");
        }
    }

    public void containsSub(String str) {
        boolean flag = false;
        for (String out : outSource) {
            if (str.contains(out)) {
                flag = true;
                break;
            }
        }
        System.out.println("是否包含：" + flag);
    }

    public void mapPut() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","liudy23");
        System.out.println(map);
        map.put("name","suyao");
        System.out.println(map);
        map.put("age",18);
        System.out.println(map);
    }


}
