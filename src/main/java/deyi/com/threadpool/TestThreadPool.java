package deyi.com.threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author : HP
 * @date : 2023/3/20
 */
public class TestThreadPool {
    public static void main(String[] args) {
        // 创建线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 4, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10));
        // 提交任务
        for (int i = 0; i < 10; i++) {
            executor.execute(new Task(i));
        }
        // 关闭线程池
        executor.shutdown();
    }
}
