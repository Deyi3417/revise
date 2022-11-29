package deyi.com.revise.override;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author HP
 * @create 2021/10/20 16:13
 *
 * 声明为 final 的方法不能被重写。
 * 声明为 static 的方法不能被重写，但是能够被再次声明。
 * 重载 (overloading) 是在一个类里面，方法名字相同，而参数不同。
 * 返回类型呢？可以相同也可以不同。
 */
public class Animal {
    public void move(){
        System.out.println("Animal.move: 动物可以移动");
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(sdf.format(date));
        int res = 0;
        for (int i = 1; i <= 100 ; i++) {
            res += i;
        }
        System.out.println(res);
    }
}
