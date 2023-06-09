package deyi.com.revise.array;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();

        // 添加元素
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Enumeration<String> elements = names.elements();
        System.out.println("elements == : " + elements);
        System.out.println("==================================");
        while (elements.hasMoreElements()) {
            String s = elements.nextElement().toString();
            System.out.println("遍历：" + names.indexOf(s) + "==== " + s);
        }

        System.out.println("==================================");




        // 获取元素
        String firstElement = names.get(0);
        System.out.println("First element: " + firstElement);

        // 遍历元素
        System.out.println("All elements:");
        for (String name : names) {
            System.out.println(name);
        }

        // 删除元素
        names.remove(1);

        // 检查大小和是否为空
        System.out.println("Size: " + names.size());
        System.out.println("Is empty? " + names.isEmpty());

        // 清空向量
        names.clear();

        System.out.println("Size after clear: " + names.size());
    }
}
