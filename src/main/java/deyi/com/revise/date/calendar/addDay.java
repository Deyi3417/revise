package deyi.com.revise.date.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class addDay {
    public static void main(String[] args) {
        // addDays(new Date());
        addDays();
    }

    public static void addDays(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Date time = calendar.getTime();
        System.out.println(sdf.format(time));
        // 在此基础上增加三个月
        calendar.add(Calendar.MONTH, 3);
        Date time2 = calendar.getTime();
        System.out.println(sdf.format(time2));
        // 在此基础上增加三天
        calendar.add(Calendar.DATE,3);
        System.out.println(sdf.format(calendar.getTime()));
    }

    public static void addDays() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 3 );
        System.out.println(sdf.format(calendar.getTime()));
    }

}
