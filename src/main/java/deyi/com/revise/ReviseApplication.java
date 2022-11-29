package deyi.com.revise;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class ReviseApplication {

    /**
     * boolean result = obj instanceof Class
     * 其中 obj 为一个对象，Class 表示一个类或者一个接口，
     * 当 obj 为 Class 的对象，或者是其直接或间接子类，
     * 或者是其接口的实现类，结果result 都返回 true，否则返回false。
     * @param args
     */
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Man();
        Man man = new Man();
        System.out.println(p1 instanceof Man);
        System.out.println(p2 instanceof Man);
        System.out.println(man instanceof Man);

        //getHour();
    }

    public static void getHour(){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("几号：" + day + "号 \n当前时间：" + hour + "时");
    }

}
