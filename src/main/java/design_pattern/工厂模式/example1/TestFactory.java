package design_pattern.工厂模式.example1;

/**
 * @author : liudy23
 * @data : 2023/3/27
 */
public class TestFactory {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();
        Shape square = ShapeFactory.createShape("square");
        square.draw();
        Shape liudy23 = ShapeFactory.createShape("liudy23");
        liudy23.draw();

    }
}
