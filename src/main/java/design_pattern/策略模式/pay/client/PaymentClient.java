package design_pattern.策略模式.pay.client;

import design_pattern.策略模式.pay.PaymentStrategy;

/**
 * 支付客户端
 * 该客户端接收一个策略对象，并通过调用策略对象的方法来计算支付金额
 *
 * @author : HP
 * @date : 2023/7/2
 */
public class PaymentClient {
    /**
     * 接收一个策略对象
     */
    private PaymentStrategy strategy;

    public PaymentClient(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 自定义一个计算钱的方法
     *
     * @param amount 输入数量即可
     * @return
     */

    public double calculatePayment(double amount) {
        return strategy.calculatePaymentAmount(amount);
    }
}
