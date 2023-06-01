package deyi.com.revise.string;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author : HP
 * @date : 2022/11/10
 */
public class AddString {
    public static void main(String[] args) {

        String format = String.format("borrow_status = %d", 3);
        System.out.println(format);

        String fieldName = "";
        System.out.println("test:  " + fieldName);
        fieldName = "deyi is so handsome";
        System.out.println(fieldName);
        fieldName = "你可以的，加油";
        System.out.println(fieldName);
        Date date = new Date();
        Date time = date;
        System.out.println(date.equals(time));
        BigDecimal a = new BigDecimal(2.3);
        Double b = 2.3;
        String s = String.valueOf(b);
        System.out.println("double : " + s);
        System.out.println(a.equals(b));
    }

    static void joinString() {
        String str1 = "a";
        String str2 = "h";
        String str3 = "d";
        String str4 = "g";
        String join = String.join(",", str1, str2, str3, str4);
        System.out.println("join ===:" + join);

    }

    static void split() {
        String str = "1,8,8,1,3,4,2";
        String[] split = str.split(",");
        List<String> strings = new ArrayList<>(Arrays.asList(split));
        System.out.println(strings);

        List<String> resultList = new ArrayList<>(split.length);
        Collections.addAll(resultList,split);
        System.out.println(resultList);
    }
}
