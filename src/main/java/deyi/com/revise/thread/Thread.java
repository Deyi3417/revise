package deyi.com.revise.thread;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author : HP
 * @date : 2022/8/17
 */
public class Thread {
    public static void main(String[] args) {
        // Executors.newFixedThreadPool(1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2, 2, 3, null, null, null, null
        );
    }

}
