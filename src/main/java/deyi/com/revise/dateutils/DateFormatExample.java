package deyi.com.revise.dateutils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatExample {
    public static void main(String[] args) {
        String inputDate = "2023-06-06";

        // 解析输入日期字符串为LocalDate对象
        LocalDate localDate = LocalDate.parse(inputDate);

        // 定义目标日期格式
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        // 格式化日期为目标格式
        String outputDate = localDate.format(outputFormatter);

        System.out.println("转换后的日期：" + outputDate);
    }
}
