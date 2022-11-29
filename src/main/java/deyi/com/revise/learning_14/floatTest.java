package deyi.com.revise.learning_14;

import java.math.BigDecimal;

/**
 * @Author HP
 * @create 2021/10/14 15:47
 */
public class floatTest {
    public static void main(String[] args) {
        round(3.349536f, 4);
    }
    public static void round(Number srcNum, int scale){
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(srcNum));
        BigDecimal res = bigDecimal.setScale(scale, BigDecimal.ROUND_HALF_UP);
        float result = res.floatValue();
        System.out.println(result);
    }

}
