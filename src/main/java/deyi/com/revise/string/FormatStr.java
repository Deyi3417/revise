package deyi.com.revise.string;

import cn.hutool.core.convert.Convert;

/**
 * @author : HP
 * @date : 2023/5/22
 */
public class FormatStr {
    public static void main(String[] args) {
        String ldy23 = String.format("*** %s *** is so handsome %.2f， %d", "liudy23", Convert.toDouble(3.1415926),999);
        System.out.println(ldy23);
    }
}
