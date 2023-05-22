package deyi.com.revise.list;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author HP
 */
public class Test {
    public static void main(String[] args) {

        Map<String, Map<String, Object>> results = new HashMap<>();

        Map<String, Object> au = new HashMap<>();
        au = results.get("123");
        System.out.println(au);
        au.put("12",23);
        System.out.println(au);

    }
}
