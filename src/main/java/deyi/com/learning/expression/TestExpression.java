package deyi.com.learning.expression;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * @author : HP
 * @date : 2023/6/26
 */
public class TestExpression {
    public static void main(String[] args) {
        test01();
        test02();
    }

    public static void test01() {
        // 创建一个ExpressionParser实例
        ExpressionParser parser = new SpelExpressionParser();
        // 创建一个EvaluationContext对象，用于提供变量值
        StandardEvaluationContext context = new StandardEvaluationContext();
        // 创建一个表达式对象
        Expression expression = parser.parseExpression("(#x < 5) && (#y < 10)");
        System.out.println("expression : " + expression);
        context.setVariable("x", 9);
        context.setVariable("y", 8);
        // 执行表达式并获取结果
        boolean result = Boolean.TRUE.equals(expression.getValue(context,Boolean.class));
        // 输出结果
        System.out.println("Result-01: " + result);
    }

    public static void test02() {
        // 创建一个ExpressionParser实例
        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();

        // 创建一个变量并为其赋值
        context.setVariable("x", "liudy23");
        context.setVariable("y", "liudy23");
        context.setVariable("z", "liudy23");

        // 创建一个表达式字符串
        String expressionString = "#y.contains('liu') && #x > 5 || #z = '是'";

        // 解析表达式时传递上下文对象
        boolean result = Boolean.TRUE.equals(parser.parseExpression(expressionString).getValue(context, Boolean.class));

        // 输出结果
        System.out.println("Result-02: " + result);
    }
}
