package deyi.com.revise.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author : HP
 * @date : 2022/8/17
 */
public class ThreadPoolLearning {
    public static void main(String[] args) {
        ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
            @Override
            protected DateFormat initialValue() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                return simpleDateFormat;
            }
        };
    }
}
