package deyi.com.revise.list;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : HP
 * @date : 2022/11/3
 */
public class insertList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int res = random.nextInt(1000);
            System.out.println(res);
            numbers.add(0, res);
        }
        System.out.println(numbers);
        numbers.add(999);
        System.out.println("====res ====" + numbers);
    }
}
