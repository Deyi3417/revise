package deyi.com.revise.matrix;

/**
 * @Author HP
 * @create 2021/11/15 16:44
 */
public class testMatrixSize {
    public static void main(String[] args) {
        short size = 9*11*2*22;
        for (int i = 0; i < size / 22; i++) {
            System.out.println("count: " + i);
        }
    }
}
