package design_pattern.模板方法模式;

import design_pattern.模板方法模式.example1.NewProgrammer;
import design_pattern.模板方法模式.example1.NewTeacher;
import design_pattern.模板方法模式.example1.Person;

/**
 * @author : liudy23
 * @data : 2023/4/23
 */
public class TestTemplate {
    public static void main(String[] args) {
        Person newProgrammer = new NewProgrammer();
        newProgrammer.live();

        Person newTeacher = new NewTeacher();
        newTeacher.live();
    }
}
