package deyi.com.revise.strOperation;

import java.util.Arrays;

/**
 * @author HP
 * @create 2022/6/16 9:44
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "1";
        String[] split = str.split(",");

        System.out.println(Arrays.toString(split));
    }
}
