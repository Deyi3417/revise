package deyi.com.learning;

import cn.hutool.core.date.DateUtil;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author : liudy23
 * @data : 2023/8/7
 */
public class VisualVM {
    public static void main(String[] args) throws IOException {
        List<byte[]> vms = new ArrayList<byte[]>();
        System.in.read();
        while (true) {
            Thread thread = Thread.currentThread();
            System.out.printf("当前线程名：" + thread.getName() + "----当前线程状态：" + thread.getState());
            RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
            String pidStr = runtimeBean.getName().split("@")[0];
            System.out.println("当前线程PID: " + pidStr);
            System.out.println("----" + DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
            final int _4m = 1024 * 1024 * 4;
            byte[] bytes = new byte[_4m];
            vms.add(bytes);
            System.in.read();
        }
    }
}
