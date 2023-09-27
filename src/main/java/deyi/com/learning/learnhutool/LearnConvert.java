package deyi.com.learning.learnhutool;

import cn.hutool.core.convert.Convert;

/**
 * @author : liudy23
 * @data : 2023/9/27
 */
public class LearnConvert {
    public static void main(String[] args) {
        learnConvert();
    }

    public static void learnConvert() {
        String number = "123";
        int numberTemp = Convert.toInt(number);
        int number2 = Integer.parseInt(number);
        System.out.println("Number: " + number);
        System.out.printf("使用hutool转化的结果：%d\n\t", numberTemp);
        System.out.printf("使用Integer.parseInt转化的结果：%d%n", number2);
    }

}
