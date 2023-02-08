package learning_review.basic;

/**
 * @author : HP
 * @date : 2023/1/11
 */
public class CharacterType {
    public static void main(String[] args) {
        boolean digit = Character.isDigit(' ');
        System.out.println(digit);
        boolean whitespace = Character.isWhitespace(' ');
        System.out.println(whitespace);
        boolean a = Character.isUpperCase('A');
        boolean a1 = Character.isUpperCase('a');
        System.out.println("--**--" + a+ "\n" + a1);
    }
}
