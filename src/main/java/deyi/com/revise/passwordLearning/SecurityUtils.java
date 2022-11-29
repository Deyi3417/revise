package deyi.com.revise.passwordLearning;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author liudy23
 * @Create 2022/2/8 15:10
 *
 * 权限获取工具类
 */
public class SecurityUtils {

    /**
     * 生成BCryptPasswordEncoder密码
     * @param password 密码
     * @return 加密字符串
     */
    public static String encryptPassword(String password){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

    /**
     * 判断密码是否相同
     * @param rawPassword 真实密码
     * @param encodedPassword 加密后字符
     * @return 结果
     */
    public static boolean matchPassword(String rawPassword, String encodedPassword){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }

    public static void main(String[] args) {
        String password = "root";
        String s = encryptPassword(password);
        // $2a$10$Z942rxFDmyy6Sr0MlVGONO9WLIOX/kp/ctr2jCBao6dH5AtxqpoVi
        // $2a$10$hLykhwbJPby2/7TKun/jJ.1MGqmRINTMk2zYimtRNoS47M2njvlz6
        System.out.println("password:root-->" + s);

        String rawPassword = "root";
        String encodedPassword = "$2a$10$hLykhwbJPby2/7TKun/jJ.1MGqmRINTMk2zYimtRNoS47M2njvlz6";
        String encodedPassword2 = "root";
        // boolean flag = matchPassword(rawPassword, encryptPassword(encodedPassword2));
        boolean flag = matchPassword(rawPassword, encodedPassword);
        if (flag){
            System.out.println("密码相匹配");
        }else {
            System.out.println("密码不匹配");
        }
    }
}
