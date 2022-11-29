package deyi.com.revise.algorithm;



/**
 * @author : HP
 * @date : 2022/8/15
 */
public class Recursion {
    public static void main(String[] args) {
        int number = 4;
        int result = factorial(number);
        System.out.println("result: " + result);
    }

    private static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        // 5*4*3*2*1
        return number * factorial(number - 1);
    }
}
