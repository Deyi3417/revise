package deyi.com.revise.date.testutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author liudy23
 * @Create 2022/2/7 15:53
 */
public class TestUtil {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = today.format(formatter);
        System.out.println(format);
        for (int i = 1; i <= 10; i++) {
            LocalDate newDate = today.minusDays(i);
            String formattedDate = newDate.format(formatter);
            System.out.println("Date " + i + " day(s) ago: " + formattedDate);
        }

//
//        // 输入的日期字符串
//        String dateString = "2022-02-22";
//        // 解析日期字符串
//        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        for (int i = 1; i <= 10; i++) {
//            LocalDate newDate = date.minusDays(i);
//            String formattedDate = newDate.format(formatter);
//            System.out.println("Date " + i + " day(s) ago: " + formattedDate);
//        }
        
        String startDate = "2022-02-22";
        String ednDate = "2022-03-03";
        LocalDate startTime = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endTime = LocalDate.parse(ednDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Period period = Period.between(startTime, endTime);
        int days = period.getDays();
        System.out.println(days);
        for (int i = 1; i <= days; i++) {
            LocalDate newDate = endTime.minusDays(i);
            String formattedDate = newDate.format(formatter);
            System.out.println("Date " + i + " day(s) ago: " + formattedDate);
        }



    }


    public static void getTime() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2022-08-15");
        System.out.println(format);
        System.out.println("parse:" + parse);
    }

}
