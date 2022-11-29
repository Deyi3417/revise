package deyi.com.revise.strOperation;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author liudy23
 * @Create 2022/2/8 11:05
 */
public class StringUtilsTest {
    public static void main(String[] args) {
        String str = "deyi";
        boolean notBlank = StringUtils.isNotBlank(str);
        boolean empty = StringUtils.isEmpty(str);
        if (!empty){
            System.out.println("str非空！");
        }
        System.out.println("isNotBlank:" + notBlank);

        String str2 = "   12  3   ";
        // 去掉字符串两端的控制符：
        String trim = StringUtils.trim(str2);
        System.out.println("str2:" + str2 + "\n" + "trim:" + trim);
    }
}
