package deyi.com.revise.string;

public class ContainsSubString {
    public static final String[] strList = {"TEL", "TCL", "GZT"};

    public static void main(String[] args) {
        String str = "GZTliudyTEL23";


        // containsSubString(str);
        containSubString02(str);
    }

    public static void containSubString02(String str) {
        for (String str1 : strList) {
            if (str.contains(str1)) {
                System.out.println("包含字符串串：" + str1);
                break;
            }
        }
    }



    public static void containsSubString(String str) {
        if (str.contains("TEL")) {
            int tel = str.indexOf("TEL");
            String substring = str.substring(tel, tel + "TEL".length());
            System.out.println(substring);
            System.out.println("inte TEL:" + tel);
            System.out.println("包含TEL:" + str);
        }else {
            System.out.println("没有包含TEL子字符串");
        }
    }
}
