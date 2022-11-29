package deyi.com.revise.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author HP
 * @create 2021/12/4 22:40
 */
public class CalculateDays {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dayTogether = sdf.parse("2020-07-19");
        Date dayCurrent = sdf.parse(sdf.format(new Date()));
        int togetherLongTime = daysApart(dayTogether, dayCurrent);
        System.out.println("小蜗牛和小仙女已经在一起度过了" + togetherLongTime + "天，往后余生，更加疼爱我的小仙女！");
    }

    public static int daysApart(Date beginDate, Date currentDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(beginDate);
        int daysNum = 0;
        while (calendar.getTime().compareTo(currentDate) != 0) {
            calendar.add(Calendar.DATE, 1);
            daysNum++;
        }
        return daysNum;
    }
}
