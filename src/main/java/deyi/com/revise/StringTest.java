package deyi.com.revise;

import java.util.Locale;
import java.util.UUID;

/**
 * @Author HP
 * @create 2021/12/3 8:15
 */
public class StringTest {
    public static void main(String[] args) {
        String s = UUID.randomUUID().toString().replace("-", "").toUpperCase(Locale.ROOT);
        System.out.println(s);

    }

    /**
     * (String)是标准的类型转换，将Object类型转换位String类型，使用(String)强制类型转换时
     * 最好使用instanceof做一个类型检查，以判断是否可以进行强转，否则容易抛出
     * ClassCastException异常。
     */
    public static void test01() {
        int a = 3;
        String b = String.valueOf(a);
        System.out.println(b.equals(a));
    }

    public static void test02() {
        Object a = 6;
        if (a instanceof String) {
            String b = (String) a;
            System.out.println(b);
        } else {
            System.out.println("error");
        }
    }

    public static void test03() {
        //Integet 封装类型
        Integer a = 9;
        String s = a.toString();
        System.out.println(s);
    }

    public static void test04() {
        ///推荐使用String.valueof();
        Integer a = 12;
        String s = String.valueOf(a);
        System.out.println(s);
    }
}
