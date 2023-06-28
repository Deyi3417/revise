package deyi.com.learning.expression;

import lombok.Data;
import org.mvel2.MVEL;

import java.util.HashMap;
import java.util.Map;

public class MvelExample {
    public static void main(String[] args) {
        // 创建一个表达式字符串
        String expressionString = "x < 5 && y < 10";
        
        // 创建一个上下文对象，用于提供变量值
        // 创建一个上下文Map，用于提供变量值
        Map<String, Integer> context = new HashMap<>();
        context.put("x", 7);
        context.put("y", 8);
//        MyContext context = new MyContext();
//        context.setX(7);
//        context.setY(8);
        
        // 使用MVEL解析和执行表达式
        boolean result = (boolean) MVEL.eval(expressionString, context);
        
        // 输出结果
        System.out.println("Result: " + result);
    }
    @Data
    public static class MyContext {
        private int x;
        private int y;
    }
}
