package deyi.com.revise.stream;

import deyi.com.revise.domain.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 数据处理：排序
 *
 * @author : HP
 * @date : 2023/3/22
 */
public class SortByStream {
    public static final List<User> user = GenerateList.getUserList();

    public static final List<Integer> numLists = Arrays.asList(1,6,3,5,9,66,99,33,
            69);

    public static void main(String[] args) {
        testSort();
    }

    public static void testSort() {
        // Java 支持数据排序，Comparable 和 Comparator接口
        Collections.sort(numLists);
        System.out.println(numLists);
        Collections.reverse(numLists);
        System.out.println(numLists);

        // Java如何支持对象排序
        Comparator<Integer> compare = Integer::compare;
//        Collections.sort(user,(u1,u2) -> u1.getAge() - u2.getAge());
//        Collections.sort(user, Comparator.comparingInt(User::getAge));

        // 按字段排序 倒序reversed()
        user.sort(Comparator.comparing(User::getAge).reversed());
        System.out.println(user);

        // 多个字段
        user.sort(Comparator.comparing(User::getAge).thenComparing(User::getId));
        System.out.println(user);

    }

}
