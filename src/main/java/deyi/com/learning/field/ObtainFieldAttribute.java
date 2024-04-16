package deyi.com.learning.field;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : liudy23
 * @data : 2023/10/14
 */
public class ObtainFieldAttribute {
    private String fieldName = "";
    private Integer intField = 0;
    private Double doubleField = 9D;
    private List<String> listStringField = new ArrayList<String>();
    private List<Map<String, String>> mapStringField = new ArrayList<Map<String, String>>();
    private Map<String, String> mapAttribute = new HashMap<String, String>();
    private Map<String, List<String>> mapAttributeList = new HashMap<String, List<String>>();

    public void setFilesAttribute() {
        String name = this.getClass().getName();
        System.out.println(name);
    }
    public static void main(String[] args) throws Exception {
        
        String name = ObtainFieldAttribute.class.getName();
        System.out.println("类的名称： " + name);
        Class<?> aClass = Class.forName(name);
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("方法名称： " + method.getName());
        }
        Field[] declaredFields = aClass.getDeclaredFields();
        int index = 0;
        for (Field declaredField : declaredFields) {
            System.out.println("字段的" + ++index +"名称： " + declaredField.getName() + ": ");
        }

        Field declaredField = aClass.getDeclaredField("listStringField");
        String fieldName = declaredField.getName();
        Class<?> fieldType = declaredField.getType();
        System.out.println("Field Name: " + fieldName);
        System.out.println("Field Type: " + fieldType.getName());

    }















}
