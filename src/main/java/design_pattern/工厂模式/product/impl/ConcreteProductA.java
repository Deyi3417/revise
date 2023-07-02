package design_pattern.工厂模式.product.impl;

import design_pattern.工厂模式.product.Product;

/**
 * 具体的产品类A
 *
 * @author : HP
 * @date : 2023/7/2
 */
public class ConcreteProductA implements Product {

    @Override
    public void use() {
        System.out.println("使用A产品的说明");
    }
}
