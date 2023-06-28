package deyi.com.revise.list;

import io.swagger.models.auth.In;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author HP
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        test01(list);
        System.out.println("list: " + list);
    }

    private static void test01(ArrayList<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(9);
    }
}
