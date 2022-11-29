package deyi.com.revise.passwordLearning;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

/**
 * @Author liudy23
 * @create 2022/1/14 15:25
 */
public class jsyptPassword {

    private static final String PBEWITHMD5ANDDES = "PBEWithMD5AndDES";
    private static final String PBEWITHHMACSHA512ANDAES_256 = "PBEWITHHMACSHA512ANDAES_256";

    public static SimpleStringPBEConfig encryJsypt(String password){
        //加解密配置
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(password);
        config.setAlgorithm(PBEWITHMD5ANDDES);
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        return config;
    }

    public static String encryptPassword(String password, String value){
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = encryJsypt(password);
        encryptor.setConfig(config);
        String resutl_encrypt = encryptor.encrypt(value);
        return resutl_encrypt;
    }

    public static String  decryptPassword(String password, String value){
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = encryJsypt(password);
        encryptor.setConfig(config);
        String result_decrypt = encryptor.decrypt(value);
        return result_decrypt;
    }

    public static void main(String[] args) {
        // BECzHhKfUlQ3Q+7VF2cMqQ==
        String s = encryptPassword("salt", "sanyjbz");
        System.out.println("root加密后：" + s);

        String salt = decryptPassword("salt", "96UIghDb7vddNajJgbAlKFvknatvG5aN");
        System.out.println("root解密后：" + salt);
    }


}
