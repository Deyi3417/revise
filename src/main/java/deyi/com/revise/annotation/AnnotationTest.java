package deyi.com.revise.annotation;

import java.lang.reflect.Method;

/**
 * @author : HP
 * @date : 2023/3/23
 */
public class AnnotationTest {
    public static void main(String[] args) {
        AnnotationClass annotation = new AnnotationClass();
        MyAnnotation myAnnotation = annotation.getClass().getAnnotation(MyAnnotation.class);
        // 类上面的注解
        System.out.println("测试类上面的注解annotation:" + myAnnotation.value());
        // 方法上面的注解
        try {
            Method method = annotation.getClass().getMethod("testMethod");
            MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("测试方法上面的注解annotation:" + methodAnnotation.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
