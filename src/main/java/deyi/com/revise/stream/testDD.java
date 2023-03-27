package deyi.com.revise.stream;

/**
 * @author : HP
 * @date : 2023/3/24
 */
public class testDD {
    public static void main(String[] args) {
        int n = 5;
        long result = f(5);
        System.out.println("result:" + result);
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
