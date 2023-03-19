package design_pattern.装饰者模式.Example1;

/**
 * @author : liudy23
 * @data : 2023/3/18
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new Decorator(component);
        component.operation();
    }
}
