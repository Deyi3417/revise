package deyi.com.revise.date.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * @author : HP
 * @date : 2023/5/8
 */
public class MinusMonth {
    public static void main(String[] args) {
        /*
        LocalDate parse = LocalDate.parse("2022-02-02");
        LocalDate localDate = parse.minusMonths(1);
        String format1 = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(format1);
        LocalDateTime localDateTime = LocalDateTime.now().minusMonths(1);
        String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format);*/
        // 是否相等且排除为null的情况
        boolean equals = Objects.equals(2, null);
        System.out.println(equals);
        String str = "null";
        // 拿到部位null的值，否则抛异常
        String res = Objects.requireNonNull(str, "密码不能为空");
        System.out.println(res);
        Integer code = 2;
        switch (code == null ? 3 : code) {
            case 1:
                System.out.println("are you ok");
                break;
            default:
                System.out.println("没有对应的！");
                break;
        }

        StringBuilder content = new StringBuilder("are you ok");
        content.append("\n-=-=");
        content.append("\n山清水秀");
        System.out.println(content.toString());


    }
}
