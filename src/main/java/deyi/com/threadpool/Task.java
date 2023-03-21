package deyi.com.threadpool;

/**
 * @author : HP
 * @date : 2023/3/20
 */
public class Task implements Runnable {

    private int num;

    public Task(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Task " + num + " is running on thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + num + " is completed.");
    }
}
