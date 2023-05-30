package deyi.com.revise.stream;

import deyi.com.revise.domain.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author : HP
 * @date : 2023/3/22
 */
@Service
public class GenerateList {
    /**
     * 生成List
     *
     * @return
     */
    public static List<User> getUserList() {
        List<User> users = Arrays.asList(
                new User(1, "张三", 18, 1,1),
                new User(2, "李四", 29, 1,2),
                new User(3, "Tom", 27, 0,3),
                new User(4, "March", 25, 0,4),
                new User(5, "Json", 23, 1,5),
                new User(6, "艾斯", 21, 0,6),
                new User(7, "Cool", 12, 0,7),
                new User(8, "九夏光年", 12, 1,8)
        );
        return users;
    }
}
