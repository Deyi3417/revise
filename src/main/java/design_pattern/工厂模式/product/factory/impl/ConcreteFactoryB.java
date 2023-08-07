package design_pattern.工厂模式.product.factory.impl;

import design_pattern.工厂模式.product.Product;
import design_pattern.工厂模式.product.factory.ProductFactory;
import design_pattern.工厂模式.product.impl.ConcreteProductB;

/**
 * 具体的工厂类B，实现了抽象工厂接口，并负责实际创建具体产品B的对象
 *
 * @author : HP
 * @date : 2023/7/2
 */
public class ConcreteFactoryB implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
