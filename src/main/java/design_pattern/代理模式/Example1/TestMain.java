package design_pattern.代理模式.Example1;

import design_pattern.代理模式.Example1.Animal;
import design_pattern.代理模式.Example1.AnimalProxy;
import design_pattern.代理模式.Example1.Chicken;
import design_pattern.代理模式.Example1.Dog;

/**
 * @author : liudy23
 * @data : 2023/3/19
 */
public class TestMain {
    public static void main(String[] args) {
        test2();
    }
    public static void test2() {
        Animal proxyDog = new AnimalProxy(new Dog());
        proxyDog.call();
        proxyDog.behavior();
        System.out.println("=========-----============----=========");

        Animal proxyChicken = new AnimalProxy(new Chicken());
        proxyChicken.call();
        proxyChicken.behavior();
    }

    public static void test1() {
        Animal dog = new Dog();
        dog.call();
        dog.behavior();
        System.out.println("=========-----============----=========");

        Animal chicken = new Chicken();
        chicken.call();
        chicken.behavior();
    }
}
