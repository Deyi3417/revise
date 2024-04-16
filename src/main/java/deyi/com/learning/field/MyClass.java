package deyi.com.learning.field;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MyClass {
    private List<String> listStringField = new ArrayList<String>();

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        Field[] fields = myObject.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println("*** " + field.getModifiers());
            if (java.lang.reflect.Modifier.isPrivate(field.getModifiers())) {
                String fieldName = field.getName();
                System.out.println("私有字段的名称: " + fieldName);
            }
        }
    }
}
