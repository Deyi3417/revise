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
        // 创建线程池 -优势：性能 没有一直创建和销毁的过程，性能好
        ThreadPoolExecutor executor = new ThreadPoolExecutor(20, 21, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(20));
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(20, 21, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(20));
        long startTime = System.currentTimeMillis();
        // 提交任务
        for (int i = 0; i < 20; i++) {
            executor.execute(new Task(i));
            System.out.println("are you ok");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));
        // 关闭线程池 等待子线程执行完 waitmodify socket()
        executor.shutdown();

        System.out.println("线程shutDown之后：" + (System.currentTimeMillis() - startTime));
    }
}
