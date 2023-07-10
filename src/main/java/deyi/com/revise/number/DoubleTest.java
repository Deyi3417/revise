package deyi.com.revise.number;

import cn.hutool.core.convert.Convert;

/**
 * @author : HP
 * @date : 2023/7/4
 */
public class DoubleTest {
    public static void main(String[] args) {
        Double a =-1.0;
        if (a <= 0) {
            System.out.println("Double 不大于0");
        } else {
            System.out.println("Double：" + a);
        }
        String format = String.format("is_deleted = '%d'", 0);
        System.out.println(format);
        Double b = 3.1415926;
        String str = Convert.toStr(b);
        System.out.println(str);

        String e1 = "[1,2]";
        String e2 = "[1,3]";
        System.out.println(e1.equals(e2));

    }
}
