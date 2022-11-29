package deyi.com.revise.date.testutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author liudy23
 * @Create 2022/2/7 15:53
 */
public class TestUtil {
    public static void main(String[] args) throws ParseException {
//        List<String> list = DateTimeUtil.MothDay();
//        System.out.println("list:" + list);
        getTime();
    }


    public static void getTime() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2022-08-15");
        System.out.println(format);
        System.out.println("parse:" + parse);
    }

}
