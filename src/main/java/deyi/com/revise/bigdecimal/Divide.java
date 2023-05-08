package deyi.com.revise.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author : HP
 * @date : 2023/4/12
 */
public class Divide {
    public static void main(String[] args) {

        int a = 22;
        int b = 91;
        int c = 43;
        int d = 175;
        BigDecimal aTemp = new BigDecimal(a);
        BigDecimal bTemp = new BigDecimal(b);
        BigDecimal cTemp = new BigDecimal(c);
        BigDecimal dTemp = new BigDecimal(d);

        int total = a + b + c + d;
        BigDecimal totalTemp = new BigDecimal(total);
        System.out.println("totalTemp: " + totalTemp);
        System.out.println("totalTemp double: " + totalTemp.doubleValue());


        BigDecimal divide = aTemp.divide(totalTemp,2, RoundingMode.HALF_UP);
        System.out.println("result a: " + divide);
        System.out.println("result b: " + bTemp.divide(totalTemp,2, RoundingMode.HALF_UP));
        System.out.println("result c: " + cTemp.divide(totalTemp,2, RoundingMode.HALF_UP));
        System.out.println("result d: " + dTemp.divide(totalTemp,2, RoundingMode.HALF_UP));

    }
}
