package deyi.com.revise.stream;

import deyi.com.revise.domain.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author : HP
 * @date : 2023/3/23
 */
public class FilterByStream {
    public static final List<User> userList = GenerateList.getUserList();

    public static void main(String[] args) {
        testFilter();
    }

    public static void testFilter() {
        System.out.println(userList.size());
        // 过滤年龄<25的数据
        List<User> collect = userList.stream().filter(user -> user.getAge() < 25).collect(Collectors.toList());
        // 保留前几项/跳过前几项
        List<User> collect1 = userList.stream().skip(3).limit(3).collect(Collectors.toList());

        // 寻找符合条件的第一项
        Optional<User> first = userList.stream().filter(user -> user.getGender() == 2).findFirst();
        User user1 = first.orElse(null);
        System.out.println(user1);
        if (first.isPresent()) {
            User user = first.get();
            System.out.println(user);
        }

        // 判断是否有符合条件的数据/是否都符合/是否都不符合
        boolean b = userList.stream().allMatch(user -> user.getAge() < 25);
        System.out.println(b);
        // 有任何一条符合则返回 true
        boolean b1 = userList.stream().anyMatch(user -> user.getAge() < 25);
        System.out.println(b1);
        // 都不符合则返回 true
        boolean b2 = userList.stream().noneMatch(user -> user.getAge() < 25);
        System.out.println(b2);

        // 保留第一个不合法数据之前的所有数据y,JDK版本必须在9以上
    }
}
