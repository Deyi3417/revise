package learning_review.basic;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * @author : HP
 * @date : 2023/1/11
 */
public class DateType {
    public static void main(String[] args) throws ParseException {
        Calendar instance = Calendar.getInstance();
        // year -用于设置year日历字段的值。 month -用于设置month日历字段的值。月值以0为基础。例如，1月份为0。 date -用于设置DAY_OF_MONTH日历字段的值。
        instance.set(2022, 1, 22);
        Date time = instance.getTime();
        String format = DateFormatUtils.format(time, "yyyy-MM-dd HH:mm:ss");
        System.out.println("format: " + format);
        int i = compareDates(time);
        System.out.println("i: " + i);
    }

    /**
     * 比较当调用此方法的Date对象和指定日期。
     * 两者相等时候返回0。
     * 调用对象在指定日期之前则返回负数。
     * 调用对象在指定日期之后则返回正数。
     *
     * @param date
     * @return
     */
    public static int compareDates(Date date) {
        return date.compareTo(new Date());
    }


    public static void calendarType() {
        // 创建一个代表系统当前日期的Calendar对象 默认是当前日期
        Calendar instance = Calendar.getInstance();
        instance.set(2022, 02, 22);
        Date time = instance.getTime();


    }

    public static void testCalendar() {
        Calendar c1 = Calendar.getInstance();
        // 获得年份
        int year = c1.get(Calendar.YEAR);
        // 获得月份
        int month = c1.get(Calendar.MONTH) + 1;
        // 获得日期
        int date = c1.get(Calendar.DATE);
        // 获得小时
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        // 获得分钟
        int minute = c1.get(Calendar.MINUTE);
        // 获得秒
        int second = c1.get(Calendar.SECOND);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = c1.get(Calendar.DAY_OF_WEEK);
    }
}
