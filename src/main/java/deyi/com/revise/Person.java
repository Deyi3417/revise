package deyi.com.revise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author HP
 * @create 2021/10/14 11:58
 */
public class Person {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.DATE);
        Date time = calendar.getTime();
        System.out.println(time);
        calendar.add(calendar.DATE,3);
        System.out.println(calendar.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(calendar.getTime());
        System.out.println(format);
    }
}
