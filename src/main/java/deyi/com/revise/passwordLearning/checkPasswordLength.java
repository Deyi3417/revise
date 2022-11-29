package deyi.com.revise.passwordLearning;


import org.apache.commons.lang3.StringUtils;

/**
 * @Author HP
 * @create 2022/1/14 11:25
 */
public class checkPasswordLength {
    public static void main(String[] args) {
        String password = "@liudy23";
        boolean result = checkPasswordLength(password, "4", "15");
        if (result){
            System.out.println("密码长度：" + password.length() + "  密码符合长度要求：" + password);
        }else {
            System.out.println("密码长度：" + password.length() + "  密码不符合长度要求：" + password);
        }

        boolean digitFlag = checkContainDigit(password);
        if (digitFlag){
            System.out.println(password + " ：密码包含数字！");
        }else {
            System.out.println(password + " ：密码不包含数字！");
        }

        boolean caseFlag = checkContainCase(password);
        if (caseFlag){
            System.out.println(password + " ：密码包含字母！");
        }else {
            System.out.println(password + " ：密码不包含字母！");
        }

        boolean specialFlag = checkContainSpecialChar(password);
        if (specialFlag){
            System.out.println(password + " ：密码包含特殊符号！");
        }else {
            System.out.println(password + " ：密码不包含特殊符号！");
        }


    }

    public static String SPECIAL_CHARS = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
    public static boolean checkContainSpecialChar(String password){
        boolean flag = false;
        char[] charsPassword = password.toCharArray();
        int num_special = 0;
        for (int i = 0; i < charsPassword.length; i++) {
            if (SPECIAL_CHARS.indexOf(charsPassword[i]) != -1){
                num_special++;
            }
        }
        if (num_special != 0){
            flag = true;
        }
        return flag;
    }

    /**
     * 检查密码是否包含字母
     * @param password
     * @return
     */
    public static boolean checkContainCase(String password){
        boolean flag = false;
        //返回的字符数组
        char[] charsPassword = password.toCharArray();
        int num_case = 0;
        for (int i = 0; i < charsPassword.length; i++) {
            //判断字符是否是字母
            if (Character.isLetter(charsPassword[i])){
                num_case++;
            }
        }
        if (num_case != 0){
            flag = true;
        }
        return flag;
    }

    /**
     * 检查密码是否包含数字
     * @param password
     * @return
     */
    public static boolean checkContainDigit(String password){
        boolean flag = false;
        char[] charsPassword = password.toCharArray();
        int num_digit = 0;
        for (int i = 0; i < charsPassword.length; i++) {
            if (Character.isDigit(charsPassword[i])){
                num_digit++;
            }
        }
        if (num_digit != 0){
            flag = true;
        }
        return flag;
    }

    /**
     * 密码长度要求
     */
    public static boolean checkPasswordLength(String password, String minNum, String maxNum){
        boolean flag = false;
        if (StringUtils.isBlank(maxNum)){
            minNum = StringUtils.isBlank(minNum) == true ? "0" : minNum;
            if (password.length() >= Integer.parseInt(minNum)){
                flag = true;
            }
        }else {
            minNum = StringUtils.isBlank(minNum) == true ? "0" : minNum;
            if (password.length() >= Integer.valueOf(minNum) && password.length() <= Integer.valueOf(maxNum)){
                flag = true;
            }
        }
        return flag;

    }
}
