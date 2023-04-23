package design_pattern.模板方法模式.example1;

/**
 * @author : liudy23
 * @data : 2023/4/23
 */
public class NewTeacher extends Person{
    @Override
    public void behavior() {
        System.out.println("老师在教室上课中---new---");
    }
}
