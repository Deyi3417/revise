package deyi.com.revise.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author HP
 */
public class PhoneVerify {
    public static void main(String[] args) {
        String phone = "1881155341";
        // 15488888888
        phoneVerify01(phone);
        phoneVerify02(phone);
    }

    public static void phoneVerify01(String phone) {
//        String regex = "^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$";
        String regex = "^1(3[0-9]|5[012356789]|7[1235678]|8[0-9])\\d{8}$";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(phone);
        boolean matches = matcher.matches();
        if (matches) {
            System.out.println("1.手机号码正确");
        }else {
            System.out.println("1.手机号码不正确");
        }
    }
    public static void phoneVerify02(String phone) {
        String regex = "^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$";
//        String regex = "^((\\d3)|(\\d{3}\\-))?13[0-9]\\d{8}|15[89]\\d{8}";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(phone);
        boolean matches = matcher.matches();
        if (matches) {
            System.out.println("2.手机号码正确");
        }else {
            System.out.println("2.手机号码不正确");
        }
    }
}
