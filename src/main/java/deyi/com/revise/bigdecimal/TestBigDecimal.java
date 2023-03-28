package deyi.com.revise.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author : HP
 * @date : 2023/3/27
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal radius = new BigDecimal("10");
        BigDecimal pi = new BigDecimal("3.1415926121314");
        BigDecimal area = pi.multiply(radius.pow(2));
        System.out.println("The area of the circle is: " + area);

        BigDecimal a1 = new BigDecimal(3.5);
        BigDecimal a2 = new BigDecimal(3.7);
        BigDecimal subtract = a1.subtract(a2).setScale(2, RoundingMode.HALF_UP);
        System.out.println(subtract);

    }
}
