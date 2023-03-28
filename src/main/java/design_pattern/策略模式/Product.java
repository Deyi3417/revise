package design_pattern.策略模式;

import design_pattern.策略模式.strategy.DiscountStrategy;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 产品：产品名称，价格，打折策略
 *
 * @author : HP
 * @date : 2023/3/28
 */
@Data
@NoArgsConstructor
public class Product {

    private String name;

    private BigDecimal price;

    private DiscountStrategy discountStrategy;

    public Product(String name, BigDecimal price, DiscountStrategy discountStrategy) {
        this.name = name;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public BigDecimal getPriceAfterDiscount() {
        return discountStrategy.calculateDiscount(price);
    }
}
