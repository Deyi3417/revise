package deyi.com.revise.string;

import org.springframework.util.Assert;

/**
 * @author : HP
 * @date : 2022/10/19
 */
public class AssertTestContain {
    public static void main(String[] args) {
        String str = "li0udy23";
        testContain(str);
        String str2 = "--";
        testContain(str2);
    }

    /**
     * 利用Assert测试，如果包含则报异常
     * @param str
     */
    public static void testContain(String str) {
        Assert.notNull(str,"目标字段为null");
        Assert.doesNotContain(str,"liu", "不能包含liu");
        System.out.println("目标字符串不包含liu");
    }
}


