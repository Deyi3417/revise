package learning_review.hutool;

import cn.hutool.core.convert.Convert;

/**
 * @author : HP
 * @date : 2023/2/8
 */
public class TestHutool {
    public static void main(String[] args) {
        test_1();
    }
    public static void test_1() {
        String str = Convert.toStr(1);
        System.out.println(str);
        int num = Convert.toInt("999");
        System.out.println(num);
    }
    public static void test_2(String str) {


    }
}
