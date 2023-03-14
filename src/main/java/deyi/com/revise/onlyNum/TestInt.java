package deyi.com.revise.onlyNum;

import java.math.BigDecimal;

/**
 * @author : HP
 * @date : 2023/2/21
 */
public class TestInt {
    public static void main(String[] args) {

        int a=7;
        int b = 9;
        BigDecimal a1 = new BigDecimal(a);
        BigDecimal b1 = new BigDecimal(b);
        BigDecimal divide = a1.divide(b1,3,BigDecimal.ROUND_HALF_UP);
        System.out.println("----" + divide);
        double v = divide.doubleValue();
        System.out.println("----==== " + v);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println();
    }
}
