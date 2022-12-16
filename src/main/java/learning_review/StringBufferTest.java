package learning_review;

import java.util.Scanner;

/**
 * @author : HP
 * @date : 2022/12/1
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBufferTest test = new StringBufferTest();
        test.selectCourses(3);
    }
    public void selectCourses(int number) {
        StringBuilder sys = new StringBuilder("校内课程管理");
        System.out.println("欢迎进入《" + sys + "》系统");
        System.out.println("请录入本学期的"+ number +"门课程");

        StringBuffer courseName = new StringBuffer();
        Scanner input = new Scanner(System.in);

        String name =  "";
        for (int i = 0; i < number; i++) {
            name = input.next();
            courseName.append(name + "\t");
            if (i == number - 1) {
                System.out.println("录入完毕！");
            }
        }

        System.out.println("本学期的必修课程是：\n" + courseName);
    }
}
