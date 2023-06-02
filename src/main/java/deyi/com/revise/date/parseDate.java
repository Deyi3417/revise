package deyi.com.revise.date;

import cn.hutool.core.date.LocalDateTimeUtil;
import deyi.com.revise.dateutils.DateTimeUtil;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author HP
 * @create 2021/11/3 15:23
 */
public class parseDate {
    public static void main(String[] args) throws ParseException {

        String monthParameter = "2023-05";
        parseTime(monthParameter);
    }

    public static void parseTime(String targetTime) {
        // 解析年份何月份
        YearMonth parse = YearMonth.parse(targetTime);
        // 获取第一天和最后一天
        LocalDate firstDayOfMonth = parse.atDay(1);
        LocalDate lastDayOfMonth = parse.atEndOfMonth();

        //
        System.out.println("----: " + firstDayOfMonth);
        System.out.println("----: " + lastDayOfMonth);

        String first = firstDayOfMonth.format(DateTimeFormatter.ofPattern(DateTimeUtil.STANDER_SHORT_FORMAT));
        String last = lastDayOfMonth.format(DateTimeFormatter.ofPattern(DateTimeUtil.STANDER_SHORT_FORMAT));
        System.out.println("----: " + first);
        System.out.println("----: " + last);




    }
}
