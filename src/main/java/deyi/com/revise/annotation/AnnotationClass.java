package deyi.com.revise.annotation;

/**
 * @author : HP
 * @date : 2023/3/23
 */
@MyAnnotation(value = "method 哒哒哒")
public class AnnotationClass {

    @MyAnnotation("class 嘀嘀嘀")
    public void testMethod() {
        System.out.println("测试自定义注解");
    }
}
