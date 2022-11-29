package deyi.com.revise.strOperation;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author liudy23
 * @Create 2022/2/10 11:30
 */
public class StrSplit {
    public static void main(String[] args) {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println("date:" + format);

        String[] split = format.split("-");
        System.out.println("split[] " + Arrays.toString(split));
        for (String s : split) {
            System.out.println(split.length + "-遍历：" + s);
        }

        Integer a = 1;
        Integer b = 1;
        if (a == b){
            System.out.println("a=b");
        }
        if (a.equals(b)){
            System.out.println("a = b");
        }

    }

}
