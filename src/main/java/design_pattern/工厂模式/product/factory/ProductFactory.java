package design_pattern.工厂模式.product.factory;

import design_pattern.工厂模式.product.Product;

/**
 * 我们定义一个抽象工厂接口，产品抽象工厂，其中
 * 包含一个方法，用户创建产品对象
 *
 * @author : HP
 * @date : 2023/7/2
 */
public interface ProductFactory {
    /**
     * 创建产品对象
     *
     * @return
     */
    Product createProduct();
}
