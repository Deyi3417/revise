package design_pattern.策略模式;

import design_pattern.策略模式.concretestrategy.RegularMemberDiscountStrategy;
import design_pattern.策略模式.concretestrategy.SuperVIPMemberDiscountStrategy;
import design_pattern.策略模式.concretestrategy.VIPMemberDiscountStrategy;

import java.math.BigDecimal;

/**
 * @author : HP
 * @date : 2023/3/28
 */
public class TestStrategy {

    private static final BigDecimal PRICE = new BigDecimal(10000);

    public static void main(String[] args) {

        Product product1 = new Product("iphone12", PRICE, new RegularMemberDiscountStrategy());
        System.out.println("RegularMemberDiscountStrategy Price after discount for product1: " + product1.getPriceAfterDiscount());

        Product product2 = new Product("iphone12", PRICE, new VIPMemberDiscountStrategy());
        System.out.println("VIPMemberDiscountStrategy Price after discount for product1: " + product2.getPriceAfterDiscount());

        Product product3 = new Product("iphone12", PRICE, new SuperVIPMemberDiscountStrategy());
        System.out.println("SuperVIPMemberDiscountStrategy Price after discount for product1: " + product3.getPriceAfterDiscount());
    }
}
