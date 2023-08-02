package deyi.com.revise.date.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author : HP
 * @date : 2023/7/21
 */
public class MinusDay02 {
    public static void main(String[] args) {
        // 获取当前日期
        LocalDate currentDate = LocalDate.now();

        // 往前推一个月
        LocalDate lastMonthDate = currentDate.minusMonths(1);

        // 格式化日期为字符串（可选）
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String lastMonthDateString = lastMonthDate.format(formatter);

        System.out.println("当前日期：" + currentDate);
        System.out.println("往前推一个月的日期：" + lastMonthDate);
        // 如果需要格式化为字符串，打印如下：
         System.out.println("往前推一个月的日期：" + lastMonthDateString);
    }
}
