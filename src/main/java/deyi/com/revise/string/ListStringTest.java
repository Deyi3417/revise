package deyi.com.revise.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : HP
 * @date : 2022/10/10
 */
public class ListStringTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("8");
        list.add("8");
        list.add("4");
        list.add("3");
        list.add("9");
        System.out.println("list:" + list);
//        System.out.println(list.toString());
        String str = list.toString();
        System.out.println(str);
        boolean contains = str.contains("3");
        String substring = str.substring(str.indexOf("[") + 1, str.lastIndexOf("]"));
        System.out.println(contains);
        System.out.println("subString:" + substring);
        System.out.println(str);
        List<String> strings = Arrays.asList(str);
        System.out.println(strings);
        List<String> strings1 = Arrays.asList(substring);
        System.out.println("string1:" + strings1);


    }
}
