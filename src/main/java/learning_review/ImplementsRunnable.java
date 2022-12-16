package learning_review;

/**
 * @author : HP
 * @date : 2022/12/1
 */
public class ImplementsRunnable implements Runnable{
    public static void main(String[] args) {
        ImplementsRunnable t = new ImplementsRunnable();
        t.run();
    }
    @Override
    public void run() {
        int i = 1;
        while(i < 5) {
            System.out.println("happy to you!");
            i++;
        }
    }
}
