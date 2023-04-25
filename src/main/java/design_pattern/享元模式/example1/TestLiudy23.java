package design_pattern.享元模式.example1;

/**
 * @author : liudy23
 * @data : 2023/4/25
 */
public class TestLiudy23 {
    public static void main(String[] args) {
        CarMoldFactory moldFactory = new CarMoldFactory();
        CarMold carMold = moldFactory.getCarMold("轿车", "钢铁");
        carMold.produceCar("凯美瑞");
    }
}
