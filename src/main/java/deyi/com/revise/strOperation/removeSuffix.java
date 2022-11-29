package deyi.com.revise.strOperation;

/**
 * @Author HP
 * @create 2022/1/14 14:43
 */
public class removeSuffix {
    public static void main(String[] args) {
        String str = "deyi.txt.java";
        //从前往后遍历
        int index = str.indexOf(".");
        //从后往前遍历
        int index1 = str.lastIndexOf(".");
        System.out.println(str.substring(0,index1));
        System.out.println("指定符号的位置：" + index1);

    }

    public static String removeSuffix(String str, String suffix){
        if (isEmpty(str) || isEmpty(suffix)){
            return str;
        }
        if (str.endsWith(suffix)){
            int index = str.indexOf(suffix);
            String substring = str.substring(0, index);
            return substring;
        }
        return str;
    }
    public static boolean isEmpty(String str){
        boolean flag = false;
        if (str == null || str.length() == 0){
            flag = true;
        }
        return flag;
    }
}
