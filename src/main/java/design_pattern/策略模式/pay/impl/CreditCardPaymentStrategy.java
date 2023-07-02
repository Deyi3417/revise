package design_pattern.策略模式.pay.impl;

import design_pattern.策略模式.pay.PaymentStrategy;

/**
 * @author : HP
 * @date : 2023/7/2
 */
public class CreditCardPaymentStrategy implements PaymentStrategy {
    /**
     * 假设信用卡支付需要加收5%的手续费
     *
     * @param amount
     * @return
     */
    @Override
    public double calculatePaymentAmount(double amount) {
        return amount * 1.05;
    }
}
