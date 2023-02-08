package deyi.com.revise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : liudy23
 * @date : 2022/12/19
 */
public class StreamOutline {
    public static void main(String[] args) {
        StreamOutline stream = new StreamOutline();
        List<String> listStr = Arrays.asList("德意", "苏谣", "北北", "熊熊", "豆豆", "姗姗", "鹏鹏","", "军军","","豆豆", "姗姗");
//        stream.testFilter(listStr);
//        stream.testMap(listStr);
//        stream.limit(listStr);
        stream.sorted();
    }
    public void testFilter(List<String> list) {
        System.out.println("source: " + list);
        List<String> collect = list.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println("new: " + collect);
        List<String> collect1 = list.stream().distinct().collect(Collectors.toList());
        List<String> deyi = list.stream().filter(m -> m.equals("豆豆")).distinct().collect(Collectors.toList());
        System.out.println("deyi: " + deyi);
        System.out.println("new distinct: " + collect1);
    }

    public void testMap(List<String> list) {
        System.out.println("source: " + list);
        int sum = list.stream().map(s -> s.length()).mapToInt(Integer::new).sum();
        System.out.println(sum);
    }

    public void limit(List<String> list) {
        System.out.println("source: " + list);
        List<String> limited = list.stream().limit(3).collect(Collectors.toList());
        System.out.println("获取前三条：" + limited);
        List<String> collect = list.stream().skip(3).collect(Collectors.toList());
        System.out.println("跳过前三条： " + collect);
    }

    public void sorted() {
        List<String> strings1 = Arrays.asList("abc", "abd", "aba", "efg", "abcd","jkl", "jkl");
        List<Integer> strings3 = Arrays.asList(10, 2, 30, 22, 1,0, -9);
        List<String> sorted1 = strings1.stream().sorted().collect(Collectors.toList());
        List<Integer> sorted3 = strings3.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted1);
        System.out.println(sorted3);
    }


}