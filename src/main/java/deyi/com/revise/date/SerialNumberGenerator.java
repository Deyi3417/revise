package deyi.com.revise.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SerialNumberGenerator {
    public static String generateSerialNumber() {
        // 获取当前日期
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String dateString = dateFormat.format(currentDate);
        
        // 生成四位随机数
        Random random = new Random();
        int randomNum = random.nextInt(9000) + 1000;
        
        // 拼接序列号
        String serialNumber = dateString + randomNum;
        return serialNumber;
    }

    public static void main(String[] args) {
        String serialNumber1 = generateSerialNumber();
        String serialNumber2 = generateSerialNumber();
        System.out.println(serialNumber1); // 示例输出：202306278888
        System.out.println(serialNumber2); // 示例输出：202305296666
    }
}
