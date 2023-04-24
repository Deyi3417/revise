package design_pattern.责任链模式.example1;

import java.util.Scanner;

/**
 * 测试责任链模式
 *
 * @author : liudy23
 * @data : 2023/4/24
 */
public class TestChainOfResponsibilityPattern {
    public static void main(String[] args) {
        /**
         * 实际开发过程中，这个模块可以封装，秩序new ClassTeacher
         */
        ClassTeacher classTeacher = new ClassTeacher();
        DepartmentHead departmentHead = new DepartmentHead();
        SchoolPrincipal schoolPrincipal = new SchoolPrincipal();
        classTeacher.setNextHandler(departmentHead);
        departmentHead.setNextHandler(schoolPrincipal);

        while(true) {
            // 模拟学生请假请求
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入请假天数：");
            int days = scanner.nextInt();
            // 提交请假请求
            classTeacher.handleLeaveRequest(days);
        }

    }
}
