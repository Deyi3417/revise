package deyi.com.revise.string;

/**
 * @author : HP
 * @date : 2022/10/8
 */
public class StringContains {
    public static void main(String[] args) {
        String str = "1,2,3,4,5,6,7,8";
        if (str.contains(String.valueOf(2))) {
            System.out.println("可以");
        }
        if (str.contains(String.valueOf(3)) || str.contains(String.valueOf(4))) {
            System.out.println("3 4 ok");
        }
        boolean flag = 2 > 3 ? true : false;
        if (flag) {
            System.out.println("2 > 3");
        } else {
            System.out.println("2 < 3");
        }
    }
}
