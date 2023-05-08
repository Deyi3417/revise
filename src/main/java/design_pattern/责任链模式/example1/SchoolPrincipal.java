package design_pattern.责任链模式.example1;

/**
 * 校长处理者
 *
 * @author : liudy23
 * @data : 2023/4/24
 */
public class SchoolPrincipal extends LeaveHandler {
    @Override
    public void handleLeaveRequest(int days) {
        if (days < 10) {
            System.out.println("校长批准了请假申请，同意请假" + days + "天。");
        } else {
            if (nextHandler != null) {
                nextHandler.handleLeaveRequest(days);
            } else {
                System.out.println("请假天数过长，无法处理该请求！");
            }
        }
    }
}
