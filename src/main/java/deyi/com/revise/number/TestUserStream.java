package deyi.com.revise.number;

import deyi.com.revise.list.User;

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

        int index = 1;
        int index1 = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println(index++);
        }
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
