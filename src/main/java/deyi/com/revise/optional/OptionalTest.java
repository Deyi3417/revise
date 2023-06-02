package deyi.com.revise.optional;

import deyi.com.revise.domain.User;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * @author : HP
 * @date : 2023/5/30
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<User> user = Optional.of(new User());

        System.out.println("optional: " + user);

        ofNullAble();
    }

    public static void testOptional() {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);
        // 判断是否存在值
        optional.isPresent();
        // 获取值
        // 如果存在值，则执行操作
        optional.ifPresent(e -> {
            System.out.println("长度：" + e.length());
            System.out.println("全都调整为大写：" + e.toUpperCase());
        });

        // 获取值，如果值为 null，则返回默认值
        String str2 = optional.orElse("suyao is so beautiful");
        System.out.println("str2:" + str2);
    }

    public static void ofNullAble() {
        User user = new User(1, "liudy23", 18, 1, 99);
        User user2 = null;
        Optional<User> optional = Optional.ofNullable(user2);
        if (optional.isPresent()) {
            System.out.println(optional.get().getUserName());
        }
        // 判断某个对象是否为null 不为null则继续
        optional.ifPresent(value -> System.out.println(value.getUserName()));


    }
}
