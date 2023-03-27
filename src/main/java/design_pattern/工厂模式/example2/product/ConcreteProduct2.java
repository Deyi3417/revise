package design_pattern.工厂模式.example2.product;

import design_pattern.工厂模式.example2.Product;

/**
 * @author : liudy23
 * @data : 2023/3/27
 */
public class ConcreteProduct2 extends Product {
    @Override
    public void use() {
        System.out.println("This is ConcreteProduct2");
    }
}
