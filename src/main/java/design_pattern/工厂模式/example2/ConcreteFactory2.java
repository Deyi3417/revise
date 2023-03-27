package design_pattern.工厂模式.example2;

import design_pattern.工厂模式.example2.product.ConcreteProduct1;
import design_pattern.工厂模式.example2.product.ConcreteProduct2;
import design_pattern.工厂模式.example2.product.ConcreteProduct3;
import design_pattern.工厂模式.example2.product.ConcreteProduct4;

/**
 * @author 刘德意
 */
public class ConcreteFactory2 implements Factory {

    @Override
    public Product createProduct(String type) {
        if ("Product3".equals(type)) {
            return new ConcreteProduct3();
        } else if ("Product4".equals(type)) {
            return new ConcreteProduct4();
        } else {
            throw new IllegalArgumentException("Invalid product type");
        }
    }
}
