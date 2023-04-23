package design_pattern.模板方法模式.example1;

/**
 * 在Java中，如果一个类继承了一个抽象类，那么它必须实现该抽象类中的所有抽象方法，或者将自己也定义为抽象类。
 *
 * @author : liudy23
 * @data : 2023/4/23
 */
public class NewProgrammer extends Person {
    /**
     * 继承Person抽象类，就必须继承父类的所有抽象方法
     */
    @Override
    public void behavior() {
        System.out.println("程序员在编程中---new---");
    }
}
