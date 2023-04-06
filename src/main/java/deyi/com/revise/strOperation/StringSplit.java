package deyi.com.revise.strOperation;

import cn.hutool.core.codec.Base64;

import java.util.Arrays;

/**
 * @author HP
 * @create 2022/6/16 9:44
 */
public class StringSplit {
    public static void main(String[] args) {
        String inputString = "杨英提交的仲裁(CFTB2022100903)流程，请及时审核！";

        if (inputString.contains("仲裁")) {
            System.out.println("包含了仲裁");
        }

        String is_so = String.format("deyi %s", "is so");
        System.out.println(is_so);
        int a = 2;
        int b = 3;
        String format = String.format("%d/%d", a, b);
        System.out.println(format);

    }
}
