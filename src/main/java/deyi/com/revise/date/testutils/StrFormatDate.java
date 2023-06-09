package deyi.com.revise.date.testutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author : HP
 * @date : 2023/6/6
 */
public class StrFormatDate {
    public static void main(String[] args) {
        String dateString = "20230606";
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = inputFormat.parse(dateString);
            String formattedDate = outputFormat.format(date);
            System.out.println(formattedDate); // 输出：2023-06-06
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
