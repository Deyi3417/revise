package deyi.com.revise.algorithm;

/**
 * @author HP
 * @date 2022-07-13
 *
 * description:
 *  题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 *  小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class Fibonacci {
    public static void main(String[] args) {
        int f1=1,f2=1,f;
        int M=30;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=3;i<M;i++) {
            f=f2;
            f2=f1+f2;
            f1=f;
            System.out.println(f2);
        }
    }

    /**
     * 微信公众号获取全局token
     */
    public static final String WX_ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";

    /**
     * 微信发送模版消息
     */
    public static final String SEND_MESSAGE_TEMPLATE_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=";

    public static void test(){


    }
}
