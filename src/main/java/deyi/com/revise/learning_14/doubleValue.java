package deyi.com.revise.learning_14;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author HP
 * @create 2022/1/4 17:38
 */
public class doubleValue {
    public static void main(String[] args) {
        int index = 0;
        //System.out.println( index + null);
        List<String> list = new ArrayList<>();
        list.add("deyi");
        list.add("liuxin");
        list.add("muxue");
        System.out.println(list);

        double d = 2;
        int a = (int) d;
        //int c = Integer.valueOf(d);

        System.out.println("d:" + d);
        System.out.println("a:" + a);




    }
}
