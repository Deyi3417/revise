package deyi.com.revise.strOperation;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/**
 * @Author liudy23
 * @Create 2022/1/19 14:13
 */
public class dateTest {
    public static void main(String[] args) throws Exception {
        //10.55.98.175  192.168.137.1
        List<String> ipList = new ArrayList<>();
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(networkInterfaces)) {
            if (null != netint.getHardwareAddress()){
                List<InterfaceAddress> interfaceAddresses = netint.getInterfaceAddresses();
                for (InterfaceAddress interfaceAddress : interfaceAddresses) {
                    String s = interfaceAddress.getAddress().toString();
                    ipList.add(s);
                    System.out.println("当前ip: " + s);
                }
            }
        }
        System.out.println("ipList: " + ipList);
    }
}
