package design_pattern.工厂模式.example1.shape;

import design_pattern.工厂模式.example1.Shape;

/**
 * @author 刘德意
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}
