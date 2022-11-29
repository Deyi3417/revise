package deyi.com.revise.string;

import java.util.Arrays;

/**
 * @author : HP
 * @date : 2022/11/22
 */
public class StringSplitTest {
    public static void main(String[] args) {
        String str = "1,8,8,1,1,5,5,3,4,1,7";
        System.out.println(str);
        String[] split = str.split(",");
        System.out.println(Arrays.toString(split));
        for (String s : split) {
            System.out.print(s+" ");


        }
    }
}
