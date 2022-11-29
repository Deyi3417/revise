package deyi.com.revise.date;

import java.util.Calendar;

/**
 * @Author HP
 * @create 2021/11/3 15:09
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = sdf.format(cal.getTime());
//        int i = cal.get(Calendar.DAY_OF_YEAR);
//        System.out.println(format);
//        System.out.println(i);
//        int i1 = cal.get(Calendar.DAY_OF_MONTH);
//        System.out.println(i1);

        System.out.println("------***------");
        int year = cal.get(Calendar.YEAR);
        System.out.println("year" + year);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.println(year+ "-" +month+ "-" +day+ "-" +hour+ "-" +minute+ "-" +second);

    }
}
