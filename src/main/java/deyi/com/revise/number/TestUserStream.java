package deyi.com.revise.number;

import deyi.com.revise.list.User;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author : HP
 * @date : 2023/7/6
 */
public class TestUserStream {
    public static void main(String[] args) {
        String str1 = null;
        boolean result1 = StringUtils.isBlank(str1); // true
        boolean result5 = StringUtils.isEmpty(str1); // true

        String str2 = "";
        boolean result2 = StringUtils.isBlank(str2);
        boolean result6 = StringUtils.isEmpty(str2); // true

        String str3 = "   ";
        boolean result3 = StringUtils.isBlank(str3);
        boolean result7 = StringUtils.isEmpty(str3); // true

        String str4 = "Hello";
        boolean result4 = StringUtils.isBlank(str4);
        boolean result8 = StringUtils.isEmpty(str4); // false
        System.out.println(result1);
        System.out.println(result5);
        System.out.println(result2);
        System.out.println(result6);
        System.out.println(result3);
        System.out.println(result7);
        System.out.println(result4);
        System.out.println(result8);

    }
    public static void test() {
        List<User> users = getUsers();
        List<User> old = users.stream().filter(e -> e.getId() != null).collect(Collectors.toList());
        List<User> newV = users.stream().filter(e -> e.getId() == null).collect(Collectors.toList());
        List<Integer> collect = users.stream().map(User::getId).filter(Objects::nonNull).collect(Collectors.toList());

        System.out.println("old: " + old);
        System.out.println("new: " + newV);
        System.out.println("collect: " + collect);



    }
    public static List<User> getUsers() {
        User user = new User("liudy23", "111");
        User user1 = new User(22,"liudy24", "222");
        User user2 = new User("liudy25", "333");
        User user3 = new User(66,"liudy24", "222");

        List<User> list = new ArrayList<User>();;
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }
}
