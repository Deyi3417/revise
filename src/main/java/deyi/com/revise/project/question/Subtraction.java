package deyi.com.revise.project.question;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author : liudy23
 * @data : 2024/6/25
 */
public class Subtraction {
    public static double calculate(double il, double isoWave) {
        double v = Double.isNaN(il) ? (Double.isNaN(isoWave) ? Double.NaN : -isoWave)
                : (Double.isNaN(isoWave) ? il : il - isoWave);
        return roundToThreeDecimalPlaces(v);
    }

    public static void main(String[] args) {
        double calculate = calculate(-2.9639, Double.NaN);
        System.out.println(calculate);
    }

    private static double roundToThreeDecimalPlaces(double value) {
        if (Double.isNaN(value)) {
            return Double.NaN;
        }
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(5, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
