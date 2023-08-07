package design_pattern.策略模式.pay.impl;

import design_pattern.策略模式.pay.PaymentStrategy;

/**
 * @author : HP
 * @date : 2023/7/2
 */
public class ZhifuBaoPaymentStrategy implements PaymentStrategy {
    /**
     * 假设支付宝支付需要加收2%的手续费
     *
     * @param amount
     * @return
     */
    @Override
    public double calculatePaymentAmount(double amount) {
        return amount * 1.02;
    }
}
