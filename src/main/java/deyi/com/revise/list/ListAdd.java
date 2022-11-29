package deyi.com.revise.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HP
 * @date : 2022/10/11
 */
public class ListAdd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(1);
        list.add(8);
        list.add(8);
        list.add(6);
        list.add(9);
        addList(list);
        System.out.println(list);
    }

    private static void addList(List<Integer> list) {
        list.add(96);
        list.add(88);
        list.add(62);
        if (true) {
            list.add(9999);
        }
    }
}
