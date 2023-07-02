package design_pattern.工厂模式.product.test;

import design_pattern.工厂模式.product.Product;
import design_pattern.工厂模式.product.factory.ProductFactory;
import design_pattern.工厂模式.product.factory.impl.ConcreteFactoryA;
import design_pattern.工厂模式.product.factory.impl.ConcreteFactoryB;

/**
 * 我们在实际使用过程中，使用具体工厂来创建具体产品对象，并调用产品对象的方法
 * 总结：通过使用工厂模式，我们可以通过抽象工厂来创建具体的产品对象，而无需直接依赖于具体产品类。这样可以
 * 将对象的创建过程与具体的客户端代码分离，提高代码的灵活性和可维护性。同时，如果要添加新的产品，只需要实
 * 现对应的具体产品和具体工厂即可，不会影响已有的代码
 *
 * @author : HP
 * @date : 2023/7/2
 */
public class ProductFactoryTest {
    public static void main(String[] args) {
        // 创建具体的工厂对：工厂A 和 工厂B
        ProductFactory factoryA = new ConcreteFactoryA();
        ProductFactory factoryB = new ConcreteFactoryB();
        Product productA = factoryA.createProduct();
        productA.use();

        Product productB = factoryB.createProduct();
        productB.use();
    }
}
