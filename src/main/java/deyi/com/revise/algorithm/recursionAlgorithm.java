package deyi.com.revise.algorithm;

public class recursionAlgorithm {
    public static void main(String[] args) {
        int number = 2;
          System.out.println("最后结果：" + calResults(number));
    }

    public static int calResults(Integer number) {
        int result = 0;
        if (number == 1) {
            return 1;
        }
        result = number + calResults(number - 1);
        return result;
    }
}
