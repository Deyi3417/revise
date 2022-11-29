package deyi.com.revise.passwordLearning;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @Author liudy23
 * @Create 2022/1/25 9:24
 */
public class Base64Util {

    final static Base64.Encoder encoder = Base64.getEncoder();
    final static Base64.Decoder decoder = Base64.getDecoder();

    /**
     * Base64加密
     * @param password 密码原文
     * @return 加密密文
     */
    public static String encodePassword(String password){
        byte[] passwordBytes = password.getBytes(StandardCharsets.UTF_8);
        String result = encoder.encodeToString(passwordBytes);
        return result;
    }

    /**
     * 解密
     * @param enPassword 加密密文
     * @return 解密原文
     */
    public static String decodePassword(String enPassword){
        byte[] decode = decoder.decode(enPassword);
        String result = new String(decode, StandardCharsets.UTF_8);
        return result;
    }

    public static void main(String[] args) {
        String password = "srv_dip_mcs:qAZR45mm@";
        String s = encodePassword(password);
        System.out.println("加密前："+password);
        System.out.println("加密后："+s);

        String enPassword = "5b635oSP";
        String result = decodePassword(enPassword);
        System.out.println("解密后："+result);

        String strUsername = "root";
        String strPassword = "root";
        String s1 = encodePassword(strUsername);
        String s2 = encodePassword(strPassword);
        System.out.println(s1);
        System.out.println(s2);
    }

}
