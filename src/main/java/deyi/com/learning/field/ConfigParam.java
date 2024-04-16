package deyi.com.learning.field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : liudy23
 * @data : 2023/10/15
 */
public class ConfigParam {

    public static String fieldName = "";
    public static Integer intField = 0;
    public static Double doubleField = 9D;
    public static List<String> listStringField = new ArrayList<String>();
    public static List<Map<String, String>> mapStringField = new ArrayList<Map<String, String>>();
    public static Map<String, String> mapAttribute = new HashMap<String, String>();
    public static Map<String, List<String>> mapAttributeList = new HashMap<String, List<String>>();

    public void setFileAttribute () {
        fieldName = "liudy23;";
    }

    public static void main(String[] args) {
        System.out.println(fieldName + "===");
    }
}
