package deyi.com.revise.learningSwitch;

import java.util.Random;

/**
 * @Author HP
 * @create 2021/11/3 22:38
 */
public class testSwitch {
    public static void main(String[] args) {
        Random random = new Random();

        int state_ready = 0;
        int state_running = 0;
        int state_error = 0;
        int state_stop = 0;
        int state_lock = 0;
        int state_warning = 0;
        int other = 0;

        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(10);
            switch (i) {
                case 1://待机设备+1
                    state_ready++;
                    break;
                case 2://运行设备+1
                    state_running++;
                    break;
                case 3://故障设备+1
                    state_error++;
                    break;
                case 4://紧停设备+1
                    state_stop++;
                    break;
                case 5://锁机设备+1
                    state_lock++;
                    break;
                case 6://报警设备+1
                    state_warning++;
                    break;
                default: //other;
                    other++;
                    break;
            }
        }
        System.out.println(
                "state_ready:" + state_ready + "\n" +
                "state_running:" + state_running + "\n" +
                "state_error:" + state_error + "\n" +
                "state_stop:" + state_stop + "\n" +
                "state_lock:" + state_lock + "\n" +
                "state_warning:" + state_warning + "\n" +
                "other:" + other + "\n"
        );

    }
}
