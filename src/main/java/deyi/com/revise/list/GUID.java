package deyi.com.revise.list;

import java.util.Random;
import java.util.UUID;

/**
 * @Author HP
 * @create 2021/11/3 10:53
 */
public class GUID {
    public static void main(String[] args) {
        Random random = new Random();
        String s = UUID.randomUUID().toString();// UUID uuid = UUID.randomUUID();
        System.out.println(s);
    }
}
