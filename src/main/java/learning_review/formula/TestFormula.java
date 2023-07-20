package learning_review.formula;

import org.apache.commons.jexl3.*;
import org.apache.commons.lang3.StringUtils;

/**
 * @author : HP
 * @date : 2023/7/19
 */
public class TestFormula {
    public static void main(String[] args) {
//        System.out.println(1>1);
//        System.out.println("dy"=="dy");
//        System.out.println("1"=="2");
//        System.out.println("1".equals("1"));
        boolean result = validate(
                "startCOA888end",
                80, 98,
                "第二仓库");
        System.out.println(result);
    }

    public static boolean validate(String materialName, int dimension, int weight, String address) {
        JexlEngine jexlEngine = new JexlBuilder().create();
        materialName.startsWith("start");
        materialName.endsWith("end");
        StringUtils.isEmpty(materialName);
        materialName.isEmpty();
        String expression1 = "true && materialName.contains('COA') " +
                "&& dimension == 80 " +
                "&& materialName.startsWith('start') " +
                "&& materialName.endsWith('end') " +
                "&& !materialName.contains('66') " +
                "&& !materialName.isEmpty() " +
                "&& weight != 88 " +
                "&& storagePosition.equals('第二仓库')";
        System.out.println("exp: " + expression1);
        JexlExpression expression = jexlEngine.createExpression(
                expression1
        );

        JexlContext context = new MapContext();
        context.set("materialName", materialName);
        context.set("dimension", dimension);
        context.set("weight", weight);
        context.set("storagePosition", address);

        return (boolean) expression.evaluate(context);
    }
}
