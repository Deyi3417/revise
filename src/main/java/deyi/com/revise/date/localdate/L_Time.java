package deyi.com.revise.date.localdate;

import java.time.LocalTime;

/**
 * @Author liudy23
 * @Create 2022/2/6 10:43
 */
public class L_Time {
    public static void main(String[] args) {
        // 提供的是没有日期数据的时间，只有时分秒数据。
        LocalTime now = LocalTime.now();
        System.out.println("notTime:" + now);

        // 解析给定的字符串时间，可以使用of和parse方法
        LocalTime parseTime = LocalTime.parse("16:30");
        System.out.println("parseTime:" + parseTime);
        LocalTime ofTime = LocalTime.of(16, 31);
        System.out.println("ofTime:" + ofTime);
    }
}
