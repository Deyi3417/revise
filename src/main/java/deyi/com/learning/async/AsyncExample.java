package deyi.com.learning.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AsyncExample {

    public static void main(String[] args) {
        // 创建一个CompletableFuture对象，表示异步操作
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // 模拟一个耗时操作
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Async operation result";
        });

        // 注册回调函数，处理异步操作完成后的结果
        future.thenAccept(result -> System.out.println("Result: " + result));

        // 执行其他操作，不会被阻塞
        System.out.println("Do something else...");

        // 等待异步操作完成
        future.join();
    }
}
