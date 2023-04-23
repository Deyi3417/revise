package deyi.com.revise.stream;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.UUID;

/**
 * @author : HP
 * @date : 2023/3/24
 */
public class testDD {
    public static void main(String[] args) {

        long a = 7;
        long b = 7;
        String format = String.format("%d/%d", a, b);
        System.out.println(format);
        System.out.println(new BigDecimal(0));
        BigDecimal atemp = new BigDecimal(a);
        BigDecimal btemp = new BigDecimal(b);
        double v = atemp.divide(btemp, 2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(v);

        String yyyyMMddHHmmss = String.format("奖罚通报_%s.pdf", UUID.randomUUID().toString());
        System.out.println("全日期：" + yyyyMMddHHmmss);
        System.out.println(UUID.randomUUID());
        String s = UUID.randomUUID().toString();
        System.out.println(s);
        long l = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(System.currentTimeMillis());

    }

    public static long f(int n) {
        if (n >= 5 && n < 10000) {
            long sum = 0;
            for (int i = n; i > 0; i--) {
                sum += i;
            }
            return sum;
        } else {
            System.out.println("您输入的参数有误，参数范围为：5 <= n < 10000");
            // 抛异常
            return n;
        }

    }

}
