package deyi.com.revise.list;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author HP
 * @date 2022-08-04
 */
public class SortList {
    public static void main(String[] args) {
//        long id = IdWorker.getId();
//        System.out.println("IdWorker:" + id);

        Random random = new Random();
        List<Integer> intList =  new ArrayList<>();
        List<Map<String, Object>> mapList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sort",random.nextInt(1000));
            map.put("name","deyi");
            mapList.add(map);
        }
        mapList = mapList.stream().sorted(new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                Integer num1 = (Integer) o1.get("sort");
                Integer num2 = (Integer) o2.get("sort");
                return num1 - num2;
            }
        }).collect(Collectors.toList());

        System.out.println(mapList);



        List<Map<String, Integer>> mapList02 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Map<String, Integer> map02 = new HashMap<String, Integer>();
            map02.put("sort",random.nextInt(1000));
            map02.put("name",33);
            mapList02.add(map02);
        }
        System.out.println("mapList02:" + mapList02);
        mapList02 = mapList02.stream().sorted(new Comparator<Map<String, Integer>>() {
            @Override
            public int compare(Map<String, Integer> o1, Map<String, Integer> o2) {
                return o1.get("sort") - o2.get("sort");
            }
        }).collect(Collectors.toList());
        System.out.println("mapList02排序后：" + mapList02);


    }
}
