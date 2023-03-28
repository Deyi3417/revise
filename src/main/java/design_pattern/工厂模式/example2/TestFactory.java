package design_pattern.工厂模式.example2;

/**
 * @author : liudy23
 * @data : 2023/3/27
 */
public class TestFactory {
    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        Product product1 = factory1.createProduct("Product1");
        product1.use();
        ConcreteFactory2 factory2 = new ConcreteFactory2();
        Product product3 = factory2.createProduct("Product3");
        product3.use();
    }
}
