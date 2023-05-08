package design_pattern.责任链模式.example1;

/**
 * 抽象处理器: 请假处理者
 *
 * @author : liudy23
 * @data : 2023/4/24
 */
public abstract class LeaveHandler {
    /**
     * 下一个请假处理者
     */
    protected LeaveHandler nextHandler;

    public void setNextHandler(LeaveHandler handler) {
        this.nextHandler = handler;
    }

    /**
     * 处理请假请求
     *
     * @param days 请假天数
     */
    public abstract void handleLeaveRequest(int days);
}
