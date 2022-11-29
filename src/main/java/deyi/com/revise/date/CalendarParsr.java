package deyi.com.revise.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author HP
 * @create 2021/11/3 15:46
 */
public class CalendarParsr {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = sdf.parse("2021-11-3");
            Calendar cal = Calendar.getInstance();
            cal.setTime(parse);
//            Date time = cal.getTime();
//            String format = sdf.format(time);
            System.out.println(cal.getTime());
            int j = 1;
            for (int i = 0; i < 8; i++) {
                String  date= sdf.format(cal.getTime());
                System.out.println("操作第"+(i+1)+"次。第"+(j-1)+"次完成。");
                cal.add(Calendar.DAY_OF_YEAR,-1);

                System.out.println("前"+i+"天：" + date);
                j++;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
