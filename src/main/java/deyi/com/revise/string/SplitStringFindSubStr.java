package deyi.com.revise.string;

import cn.hutool.core.convert.Convert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : HP
 * @date : 2023/7/25
 */
public class SplitStringFindSubStr {
    public static void main(String[] args) {
        String str = "1.2×1.9×1.6";
        String[] split = str.split("×");
        if (split.length < 1 || (split.length == 1 && split[0].isEmpty())) {
            throw new IllegalArgumentException("输入字符串格式错误：至少需要一个有效数字");
        }
        List<String> list = Arrays.asList(split);
        String max = Collections.max(list);
        String min = Collections.min(list);
        System.out.println(Convert.toDouble(max));
        System.out.println(Convert.toDouble(min));

    }
}
