package deyi.com.revise.scheduled;

import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author HP
 * @create 2021/11/9 16:47
 */
public class ScheduledTest {


    public static void testFixedDelayString() {
        System.out.println("Execute at " + System.currentTimeMillis());
    }

    @Scheduled(fixedDelayString = "1000") //上一次执行完毕时间点之后5秒再执行
    public static void main(String[] args) {
        testFixedDelayString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sdf.format(new Date()));
    }
}
