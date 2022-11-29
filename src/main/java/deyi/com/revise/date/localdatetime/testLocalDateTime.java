package deyi.com.revise.date.localdatetime;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @author : HP
 * @date : 2022/9/5
 */
public class testLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime verifyTime = LocalDateTime.of(2022, 2, 2, 2, 2, 2);
        boolean after = verifyTime.isAfter(LocalDateTime.now());
        boolean before = verifyTime.isBefore(LocalDateTime.now());
        System.out.println("after: " + after);
        System.out.println("before: " + before);
        String format1 = verifyTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("format1：" + format1);
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("format " + format);
        now.atOffset(ZoneOffset.of("+8"));
        String format2 = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("format2 " + format2);
    }
}
