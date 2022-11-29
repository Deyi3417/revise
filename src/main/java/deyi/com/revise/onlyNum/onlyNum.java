package deyi.com.revise.onlyNum;

import java.util.Date;
import java.util.Random;

/**
 * @Author HP
 * @create 2021/12/26 21:07
 */
public class onlyNum {
    public static void main(String[] args) {
        Integer a = 999999999;
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        Random random = new Random();
        int i = random.nextInt(999999999);
        System.out.println(i);


    }
}
