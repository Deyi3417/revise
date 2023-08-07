package design_pattern.策略模式.pay.test;

import design_pattern.策略模式.pay.PaymentStrategy;
import design_pattern.策略模式.pay.impl.CreditCardPaymentStrategy;
import design_pattern.策略模式.pay.impl.ZhifuBaoPaymentStrategy;

/**
 * 通过使用策略模式，我们可以根据需要选择不同的支付策略，并且可以轻松地扩展和添加新的支付策略。并且可以轻松地扩展
 * 和添加新的支付策略，而不需要修改客户端代码。这样可以提高代码的可维护性和扩展性
 *
 * @author : HP
 * @date : 2023/7/2
 */
public class StrategyModelTest {
    public static void main(String[] args) {
        // 首先用户自定义选择那种支付方式
        // 用户1选择使用信用卡，用户2使用支付宝
        int user1_amount = 20000;
        int user2_amount = 30000;
        // 使用具体的支付策略
        PaymentStrategy user1_strategy = new CreditCardPaymentStrategy();
        double user1_money = user1_strategy.calculatePaymentAmount(user1_amount);
        String user1_result = String.format("用户1 user_amount: %d;选择使用信用卡支付，支付金额：%.2f", user1_amount, user1_money);
        System.out.println(user1_result);

        ZhifuBaoPaymentStrategy user2_strategy = new ZhifuBaoPaymentStrategy();
        double user2_money = user2_strategy.calculatePaymentAmount(user2_amount);
        String user2_result = String.format("用户2 user_amount: %d;选择使用支付宝支付，支付金额：%.2f", user2_amount, user2_money);
        System.out.println(user2_result);

    }
}
