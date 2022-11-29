package deyi.com.revise.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author HP
 * @create 2021/10/29 14:30
 */
public class SizeList {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();//开辟内存空间
        if (users != null){//分配内存空间
            System.out.println("users != null is true!");
        }
        if (users.isEmpty()){
            System.out.println("users.size() isEmpty() is true! --");
        }
        if (users.size() == 0){
            System.out.println("users.size() == 0 is true! --" + users.size());
        }
        User user1 = new User(1,"慕云","123");
        User user2 = new User(2,"流樱","231");
        User user3 = new User(3,"兮雨","312");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        if (users != null){
            System.out.println("2:users != null is true!");
        }
        if (users.size() != 0){
            System.out.println("2:users.size() != 0 is true!" + users.size());
        }



    }


}
