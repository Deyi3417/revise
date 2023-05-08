package deyi.com.revise.date.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : HP
 * @date : 2023/5/8
 */
public class MinusMonth {
    public static void main(String[] args) {
        LocalDate parse = LocalDate.parse("2022-02-02");
        LocalDate localDate = parse.minusMonths(1);
        String format1 = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(format1);
        LocalDateTime localDateTime = LocalDateTime.now().minusMonths(1);
        String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format);

    }
}
