package deyi.com.revise.strOperation;

import java.util.Arrays;
import java.util.Date;

public class StringBufferTest {
    public static void main(String[] args) {
//        String str = "/deyi&suyao.com";
//        testString(str);
//        testSplit(str);
//        testStringFormat();
        testStringDate();
    }
    public static void testString(String str){
        boolean flag = str.startsWith("s",6);
        System.out.println(flag);
        System.out.println(str.substring(1));
    }
    public static void testSplit(String str){
        String[] deyis = str.split("deyi");
        // 数组形式使用arrays.toString方法输出
        System.out.println(Arrays.toString(deyis));
    }
    public static void testStringFormat(){
        // 格式化一个整数,位数不够向前补0(\d整数只能长度为10位)
        String format = String.format("%010d", 123);
        System.out.println(format);

        // 格式化一个浮点数,整数位不够向前补0,小数位不够向后补0
        String format1 = String.format("%010.3f", 666.0);
        System.out.println(format1);
    }
    public static void testStringDate(){
        String s1 = String.format("%tY", new Date());   //2011
        String s2 = String.format("%tm", new Date());   //03
        String s3 = String.format("%tF", new Date());    //2011-03-04
        String s4 = String.format("%tR", new Date());   //16:13
        String s9 = String.format("%tr", new Date());   //04:12:32 下午
        String s5 = String.format("%tT", new Date());   //15:49:34
        String s6 = String.format("%tc", new Date());   //星期五 三月 04 15:49:34 CST 2011
        String s7 = String.format("%tD", new Date());  //03/04/11
        String s8 = String.format("%td", new Date());   //04


        String s10 = String.format("%tI", new Date());   //04
        String s11 = String.format("%tH", new Date());   //04
        String s12 = String.format("%tk", new Date());   //04


        System.out.println(s10 + "\n" +
                s11 +"\n"+
                s12);
    }
}
