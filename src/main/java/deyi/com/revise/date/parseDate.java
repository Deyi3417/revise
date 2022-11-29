package deyi.com.revise.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author HP
 * @create 2021/11/3 15:23
 */
public class parseDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2020-07-29");
        String format = sdf.format(parse);
        System.out.println(format);
        Calendar cal = Calendar.getInstance();
        cal.setTime(parse);
        Date time = cal.getTime();
        System.out.println("Calendar:" + sdf.format(time));
        int i = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(i);
        for (int j = 0; j < 8; j++) {

        }








    }
}
