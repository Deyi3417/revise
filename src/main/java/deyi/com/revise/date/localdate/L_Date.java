package deyi.com.revise.date.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @Author liudy23
 * @Create 2022/2/6 10:21
 */
public class L_Date {
    public static void main(String[] args) {
        // 是 ISO 格式（yyyy-MM-dd）的日期，没有时分秒的时间数据。
        LocalDate now = LocalDate.now();
        System.out.println("now:" + now);
        // 获取明天的日期，即当前日期加一天：
        LocalDate plusDay = now.plusDays(1);
        System.out.println("plusDay:" + plusDay);
        // 获取昨天的日期，即当前日期减2天：
        LocalDate minusDay = now.minusDays(2);
        System.out.println("minusDay:" + minusDay);
        // 当前日期减三个月
        LocalDate minus_MONTH = now.minus(3, ChronoUnit.MONTHS);
        System.out.println("minus_MONTH:" + minus_MONTH);


        //可以使用of方法或parse方法获取指定日期的LocalDate实例
        LocalDate of_time = LocalDate.of(2022, 2, 13);
        System.out.println("of_time:" + of_time);

        LocalDate parse_time = LocalDate.parse("2022-02-13");
        System.out.println("parse_time:" + parse_time);

        DayOfWeek dayOfWeek = parse_time.getDayOfWeek();
        System.out.println("dayOfWeek:" + dayOfWeek);
        int dayOfMonth = parse_time.getDayOfMonth();
        System.out.println("dayOfMonth:" + dayOfMonth);


    }
}
