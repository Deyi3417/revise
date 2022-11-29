package deyi.com.revise.passwordLearning;

import sun.misc.BASE64Encoder;

/**
 * @Author HP
 * @create 2022/1/14 17:27
 */
public class base64decrypt {
    public static void main(String[] args) {
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String data = "root";
        System.out.println(base64Encoder.encode(data.getBytes()));
        String miwen = "c3J2X2RpcF9tY3M6cUFaUjQ1bW1A";

        //Base64加密


        //Base64解密

    }
}
