package deyi.com.revise.list;

import deyi.com.revise.domain.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author : HP
 * @date : 2023/5/30
 */
public class SortDomain {
    public static void main(String[] args) {
        User user1 = new User(21,"liudy23",18,1,29);
        User user2 = new User(23,"liudy23",18,1,19);
        User user3 = new User(31,"liudy23",18,1,59);
        User user4 = new User(41,"liudy23",18,1,9);
        List<User> userList = Arrays.asList(user1, user2, user3, user4);
        System.out.println("userList: " + userList);
        Collections.sort(userList, Comparator.comparing(User::getSort));
        System.out.println("userList升序: " + userList);
        userList.sort(Comparator.comparing(User::getSort).reversed());
        System.out.println("userList降序: " + userList);
    }
}
