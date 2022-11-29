package deyi.com.revise.date.calendar;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * 找到当前日期的前30天
 *
 * @author : HP
 * @date : 2022/11/22
 */
public class BeforeDays {
    public static void main(String[] args) {
        final int days = 30;
        Calendar calendar = Calendar.getInstance();
        // 当前日期
        Date time = calendar.getTime();
        String format = DateFormatUtils.format(time, "yyyy-MM-dd");
        System.out.println("---01---" + format);

        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - 30);
        Date time02 = calendar.getTime();
        String format02 = DateFormatUtils.format(time02, "yyyy-MM-dd");
        System.out.println("---02---" + format02);

        int beginYear = calendar.get(Calendar.YEAR);
        int beginMonth = calendar.get(Calendar.MONTH);
        int beginDay = calendar.get(Calendar.DAY_OF_YEAR);
        for (int i = 0; i < days; i++) {
            calendar.set(Calendar.YEAR, beginYear);
            calendar.set(Calendar.MONTH, beginMonth);
            calendar.set(Calendar.DAY_OF_YEAR, beginDay + i);
            Date time03 = calendar.getTime();
            String format03 = DateFormatUtils.format(time03, "yyyy-MM-dd");
            System.out.println("====***"+ i +"***==== " + format03);
        }


    }
}
