package learning_review;

import lombok.Data;

/**
 * 方法重载特点：在同一个类中，方法名相同，参数列表不同。
 * 支持，在一个类当中构造方法可以有多个，并且所有的构造方法名字都是一样的。
 * 第一：修饰符列表目前统一写：public 千万不要写public static。
 * <p>
 * 第二：构造方法名必须和类名一致。
 * <p>
 * 第三：构造方法不需要指定返回值类型，也不能写void，写上void表示普通方法，就不是构造方法了。
 *
 * @author : HP
 * @date : 2022/11/29
 */
@Data
public class User {
    int id;
    String name;
    int age;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
