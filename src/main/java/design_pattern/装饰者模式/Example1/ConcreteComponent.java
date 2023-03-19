package design_pattern.装饰者模式.Example1;

/**
 * 具体的组件
 *
 * @author : liudy23
 * @data : 2023/3/18
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent Operation!");
    }
}
