package deyi.com.revise.string;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : HP
 * @date : 2022/12/16
 */
public class StringFormat {
    public static void main(String[] args) {
        StringFormat format = new StringFormat();
        format.test();

    }
    public void test() {
        List<String> content = new ArrayList<>();
        content.add(String.format("检验单号：**%s**", "GYJL-007"));
        content.add(String.format("检验类型：**%s**", "通用"));
        content.add(String.format("检验结果：**%s**", "合格"));
        content.add(String.format("依据条款：**%s**", "自制：罚款7元"));
        content.add(String.format("检验人：**%s**","刘德意"));
        String resultStr = StringUtils.join(content, "\n");
        System.out.println("resultStr:" + resultStr);
    }
}
