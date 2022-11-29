package deyi.com.revise.schedule;

import java.util.Timer;
import java.util.TimerTask;

public class TimerSchedule {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(outputs(),2000L,1000L);
    }

    public static TimerTask outputs(){
        System.out.println("dy");
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("dydy");
            }
        };

        return null;
    }
}
