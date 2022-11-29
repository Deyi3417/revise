package deyi.com.revise.date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @author : HP
 * @date : 2022/8/17
 */
public class FormatDate {
    public static void main(String[] args) throws ParseException {
        String format = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(format);
        // String.valueOf(DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT))
        System.out.println(DateFormatUtils.format(new Date(),"yyyy-MM-dd"));
        Random random = new Random();
        String str = String.format("%02d", random.nextInt(99));
        System.out.println("str: "  + str);
        String concat = format.concat(str);
        System.out.println("concat: " + concat);

        System.out.println("================");
        String time = "2022-02-22 22:22:22";
        Date date = DateUtils.parseDate(time, "yyyy-MM-dd HH:mm:ss");
        System.out.println("parseDate: " + date);

        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, 3);
        Date time1 = instance.getTime();
        System.out.println("time1: " + time1);
        String format2 = DateFormatUtils.format(time1, "yyyy-MM-dd HH:mm:ss");
        System.out.println("format2: " + format2);
    }
}
