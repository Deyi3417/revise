package design_pattern.策略模式.strategy;

import java.math.BigDecimal;

/**
 * 打折策略接口
 *
 * @author HP
 */
public interface DiscountStrategy {
    /**
     * 计算打折
     *
     * @param price
     * @return
     */
    BigDecimal calculateDiscount(BigDecimal price);
}