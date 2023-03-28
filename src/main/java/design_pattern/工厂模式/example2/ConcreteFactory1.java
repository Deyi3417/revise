package design_pattern.工厂模式.example2;

import design_pattern.工厂模式.example2.product.ConcreteProduct1;
import design_pattern.工厂模式.example2.product.ConcreteProduct2;

/**
 * @author 刘德意
 */
public class ConcreteFactory1 implements Factory {

    @Override
    public Product createProduct(String type) {
        if ("Product1".equals(type)) {
            return new ConcreteProduct1();
        } else if ("Product2".equals(type)) {
            return new ConcreteProduct2();
        } else {
            throw new IllegalArgumentException("Invalid product type");
        }
    }
}
