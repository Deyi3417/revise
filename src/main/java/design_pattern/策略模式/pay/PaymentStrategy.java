package design_pattern.策略模式.pay;

/**
 * 支付策略的接口
 *
 * @author : HP
 * @date : 2023/7/2
 */
public interface PaymentStrategy {
    /**
     * 首先定义一个抽象策略接口，它包含一个计算支付金额的方案
     *
     * @param amount
     * @return
     */
    double calculatePaymentAmount(double amount);

}
