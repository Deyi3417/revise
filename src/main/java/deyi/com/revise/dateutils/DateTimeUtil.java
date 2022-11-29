package deyi.com.revise.dateutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author liudy23
 * @Create 2022/2/7 15:35
 */
public class DateTimeUtil {
    private static final Logger logger = LoggerFactory.getLogger(DateTimeUtil.class);
    /**
     * The constant STANDER_FORMAT
     */
    public static final String STANDER_FORMAT = "yyyy-MM-dd HH:mm:ss";
    /**
     * The constant STANDER_SHORT_FORMAT
     */
    public static final String STANDER_SHORT_FORMAT = "yyyy-MM-dd";

    public static List<String> MothDay(){
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(getMonthEndDay());
        int endMothDay = endCalendar.get(Calendar.DAY_OF_MONTH);
        List<String> list = new ArrayList<>(endMothDay);
        for (int i = 1; i <= endMothDay; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }

    private static Date getMonthEndDay() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        String dateStr = formatter.format(cale.getTime());
        return parse(dateStr, STANDER_FORMAT);
    }

    private static Date parse(String dateStr, String standerFormat) {
        try {
            return new SimpleDateFormat(standerFormat).parse(dateStr);
        } catch (ParseException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }


}
