package design_pattern.代理模式.Example2;

import design_pattern.代理模式.Example1.Animal;
import design_pattern.代理模式.Example1.Dog;

/**
 * @author : liudy23
 * @data : 2023/3/19
 */
public class TestMain2 {
    public static void main(String[] args) {
        test();

    }
    public static void test() {
        Animal dog = CustomLogInvocationHandler.createProxy(new Dog(), Animal.class);
        dog.call();
        dog.behavior();
    }
}
