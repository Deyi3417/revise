package deyi.com.revise.stream;

import deyi.com.revise.domain.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 数据处理：分组
 *
 * @author : HP
 * @date : 2023/3/22
 */
public class GroupByStream {

    public static final List<User> userList = GenerateList.getUserList();

    public static void main(String[] args) {
        testGroup();
    }

    public static void testGroup() {
        userList.stream().forEach(e ->
                System.out.println(e));

        // 根据某个字段进行分组
        Map<Integer, List<User>> collect = userList.stream().collect(Collectors.groupingBy(e -> e.getGender()));
        for (Integer integer : collect.keySet()) {
            System.out.println(collect.get(integer));
        }

        // 自定义分组名称
        Map<String, List<User>> collect1 = userList.stream().collect(Collectors.groupingBy(user -> {
            Integer age = user.getAge();
            if (age >= 18) {
                return "成年";
            } else {
                return "未成年";
            }
        }));
        System.out.println(collect1);

        // 每个分组的数量
        Map<Integer, Long> collect2 = userList.stream().collect(Collectors.groupingBy(User::getGender, Collectors.counting()));
        System.out.println(collect2);
    }
}
