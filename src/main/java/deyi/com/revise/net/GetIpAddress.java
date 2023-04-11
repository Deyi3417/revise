package deyi.com.revise.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author : HP
 * @date : 2023/4/7
 */
public class GetIpAddress {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("IP Address : " + localhost.getHostAddress());
            System.out.println("Host Name : " + localhost.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
