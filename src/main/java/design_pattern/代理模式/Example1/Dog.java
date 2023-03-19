package design_pattern.代理模式.Example1;

/**
 * @author : liudy23
 * @data : 2023/3/19
 */
public class Dog implements Animal{
    @Override
    public void call() {
        System.out.println("汪、汪、汪");
    }

    @Override
    public void behavior() {
        System.out.println("蹦蹦跳跳");
    }
}
