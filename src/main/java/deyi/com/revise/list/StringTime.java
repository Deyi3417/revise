package deyi.com.revise.list;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author HP
 * @create 2021/10/29 15:30
 */
public class StringTime {
    public static void main(String[] args) {
        String str = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0){
                str = "deyi is so handsome -->" + i;
                list.add(str);
            }else {
                str = "suyao pretty girl! -->" + i;
                list.add(str);
            }
        }
        System.out.println(list);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        System.out.println(sdf.format(new Date()));
    }
}
