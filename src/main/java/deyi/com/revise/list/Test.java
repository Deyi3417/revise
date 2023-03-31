package deyi.com.revise.list;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 34, 5, 6, 7, 3706);
        Set<Integer> collect = list.stream().filter(e -> e > 10).collect(Collectors.toSet());
        if (collect.contains(3706)) {
            System.out.println("确实包含了3706");
        }

    }
}
