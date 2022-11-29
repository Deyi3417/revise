package learning_review;

/**
 * @Author HP
 * @create 2021/12/6 22:05
 */
public class StopThread extends Thread {
    private int i = 0;
    private int j = 0;
    @Override
    public void run() {
        //增加同步锁，增加线程安全
        synchronized (this){
            ++i;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ++j;
        }
    }
    public void print(){
        System.out.println("i=" + i + " j=" + j);
    }
}
