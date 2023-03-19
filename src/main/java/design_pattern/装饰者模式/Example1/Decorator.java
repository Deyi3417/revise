package design_pattern.装饰者模式.Example1;

/**
 * 装饰者
 *
 * @author : liudy23
 * @data : 2023/3/18
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("Decorator Operation!");
    }
}
