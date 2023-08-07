package learning_review.formula;

import org.apache.commons.jexl3.*;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * @author : HP
 * @date : 2023/7/20
 */
public class testFormula02 {
    public static void main(String[] args) {
        String exp = StringUtils.EMPTY;
        String newExp = generateExpression(exp);
        System.out.println("exp :" + exp);
        System.out.println("newExp :" + newExp);
        boolean addWrapper = false;
        newExp = addWrapper ? "(" + newExp :  newExp;
        System.out.println("addLeftWrapper: " + newExp);
        newExp = addWrapper ? newExp + ")" : newExp;
        System.out.println("addRightWrapper: " + newExp);


        System.out.println();
        boolean equals = Objects.equals("||", "&&");
        System.out.println(equals);
        boolean validate = validate();
        System.out.println(validate);

    }

    public static String generateExpression(String expression) {
        expression = expression + "liudy23 is so " + "1" + "1" + "1" + "3";
        System.out.println(expression);
        return expression;
    }

    public static boolean validate() {
        JexlEngine jexlEngine = new JexlBuilder().create();
        String expression1 = "true&&false||(true&&true)";
        System.out.println("exp: " + expression1);
        JexlExpression expression = jexlEngine.createExpression(
                expression1
        );
        return (boolean) expression.evaluate(new MapContext());
    }
}
