package deyi.com.revise.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author HP
 * @create 2021/11/2 15:09
 */
public class listArray {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        // 会报 UnsupportedOperationException
        boolean liudy23 = list1.add("liudy23");
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        System.out.println("-----: " + list);
        list.add("grape"); // 添加元素
        System.out.println("add:  " + list);
        list.remove("banana"); // 删除元素
        System.out.println(list); // 输出: [apple, orange, grape]
        // 可以
        list.remove(1);
        System.out.println(list);


    }
}
