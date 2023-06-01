package deyi.com.revise.date.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : HP
 * @date : 2023/4/17
 */
public class MinusDay {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String tempToday = today.format(formatter);
        System.out.println(tempToday);
        LocalDate minusSevenDays = today.minusDays(7);
        String sevenDay = minusSevenDays.format(formatter);
        System.out.println(sevenDay);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nowTemp = now.format(dateTimeFormatter);
        System.out.println(nowTemp);
        LocalDateTime minus = LocalDateTime.now().minusDays(7);
        System.out.println(minus.format(dateTimeFormatter));



    }
}
