package design_pattern.工厂模式.example1;

import design_pattern.工厂模式.example1.shape.Circle;
import design_pattern.工厂模式.example1.shape.Rectangle;
import design_pattern.工厂模式.example1.shape.Square;

/**
 * 工厂模式
 *
 * @author 刘德意
 */
public class ShapeFactory {

    public static Shape createShape(String type) {
        if ("circle".equals(type)) {
            return new Circle();
        } else if ("rectangle".equals(type)) {
            return new Rectangle();
        } else if ("square".equals(type)) {
            return new Square();
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }
    }
}







