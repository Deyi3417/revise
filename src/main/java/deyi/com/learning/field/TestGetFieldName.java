package deyi.com.learning.field;

import java.lang.reflect.Field;

/**
 * @author : liudy23
 * @data : 2023/10/15
 */
public class TestGetFieldName {
    public static void main(String[] args) {
        String fieldName = ConfigParam.fieldName;
        // TODO 获取fieldName的字符串形式，并输出“获取fieldName“
        try {
            Field field = ConfigParam.class.getDeclaredField("fieldName");
            String fieldNameString = field.getName();
            System.out.println("获取" + fieldNameString);
        } catch (NoSuchFieldException e) {
            System.err.println("字段名不存在");
        }
    }
}
