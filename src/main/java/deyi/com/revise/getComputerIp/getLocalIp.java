package deyi.com.revise.getComputerIp;

import java.net.InetAddress;

/**
 * @Author liudy23
 * @Create 2022/1/19 16:41
 */
public class getLocalIp {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("localHost: " + localHost);
        String hostAddress = localHost.getHostAddress();
        System.out.println("hostAddress: " + hostAddress);
        String hostName = localHost.getHostName();
        System.out.println("hostName: " + hostName);
    }
}
