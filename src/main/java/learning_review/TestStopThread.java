package learning_review;

/**
 * @Author HP
 * @create 2021/12/6 22:24
 */
public class TestStopThread {
    public static void main(String[] args) throws InterruptedException {
        StopThread st = new StopThread();
        st.start();
        Thread.sleep(1000);
//        st.stop();
        st.interrupt();
        while(st.isAlive()){
            System.out.println("线程还活着！");
        }
        st.print();
    }
}
