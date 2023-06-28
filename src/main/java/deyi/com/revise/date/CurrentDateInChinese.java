package deyi.com.revise.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrentDateInChinese {
    public static void main(String[] args) {
        // 获取当前日期
        LocalDate currentDate = LocalDate.now();
        
        // 创建自定义的日期格式化器，指定中文格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日", Locale.CHINA);
        
        // 格式化日期为中文格式
        String chineseDate = currentDate.format(formatter);
        
        System.out.println(chineseDate); // 示例输出：2023年6月28日
    }
}
