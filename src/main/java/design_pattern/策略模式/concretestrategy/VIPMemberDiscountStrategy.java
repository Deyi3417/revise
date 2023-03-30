package design_pattern.策略模式.concretestrategy;

import design_pattern.策略模式.strategy.DiscountStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * VIP打折策略
 *
 * @author HP
 */
public class VIPMemberDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal calculateDiscount(BigDecimal price) {
        return price.multiply(new BigDecimal(0.8)).setScale(2, RoundingMode.HALF_UP);
    }
}