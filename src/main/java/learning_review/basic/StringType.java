package learning_review.basic;

/**
 * @author : HP
 * @date : 2023/1/11
 */
public class StringType {
    public static void main(String[] args) {
        String str = "liudy23";
        System.out.println("length: " + str.length());
        String concat = str.concat(" is so handsome");
        System.out.println("str: " + str);
        System.out.println("concat: " + concat);
        stringFormat(str);

    }

    /**
     * %s string
     * %d integer
     * %f float
     * @param str
     */
    public static void stringFormat(String str) {
        String formatString = String.format("%s max value", str);
        System.out.println("formatString: " + formatString);
        String formatInteger = String.format("%d integer", 9);
        System.out.println("formatInteger: " + formatInteger);

        String formatFloat = String.format("%f float", 9.9);
        System.out.println("formatFloat: " + formatFloat);
    }
}
