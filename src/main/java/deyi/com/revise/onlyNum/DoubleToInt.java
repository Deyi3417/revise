package deyi.com.revise.onlyNum;

public class DoubleToInt {
    public static void main(String[] args) {
        mathCeil();




        Double b = 7.8;
        int i2 = 2;
        System.out.println("test:" + b/i2);
    }

    public static void mathCeil() {
        Double number1 = 5.9;
        Double number2 = 5.3;
        // Double number1 四舍五入
        double round1 = Math.round(number1);
        System.out.println("number1:" + number1);
        System.out.println("round1:" + round1);
        int round1Res = new Double(round1).intValue();
        System.out.println("round1Res:" + round1Res);
        // Double number2 四舍五入
        double round2 = Math.round(number2);
        System.out.println("number1:" + number2);
        System.out.println("round2:" + round2);
        int round2Res = new Double(round2).intValue();
        System.out.println("round2Res:" + round2Res);
    }
}
