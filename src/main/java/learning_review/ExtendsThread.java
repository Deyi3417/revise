package learning_review;

/**
 * @author : HP
 * @date : 2022/12/1
 */
public class ExtendsThread extends Thread{
    public static void main(String[] args) {
        ExtendsThread t = new ExtendsThread();
//        Thread t = new Thread();
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("祝您成功！");
            i++;
        }
    }
}
