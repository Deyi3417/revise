package learning_review.domain;

import com.alibaba.fastjson.JSON;
import learning_review.User;

/**
 * @author : HP
 * @date : 2023/7/25
 */
public class TestUser {
    public static void main(String[] args) {
        User user = new User();
        String s = giveValue(user);
        System.out.println(JSON.toJSONString(user));
        System.out.println(s);
    }
    private static String giveValue(User user) {
        user.setAge(18);
        user.setId(99);
        user.setName("liudy23");
        return "is OK?";
    }
}
