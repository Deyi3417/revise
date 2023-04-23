package design_pattern.模板方法模式.example1;

/**
 * @author : liudy23
 * @data : 2023/4/23
 */
public class Teacher {
    protected void wakeUp() {
        System.out.println("起床-----");
    }

    protected void behavior() {
        System.out.println("老师在教室上课中-----");
    }

    protected void sleep() {
        System.out.println("睡觉-----");
    }
}
