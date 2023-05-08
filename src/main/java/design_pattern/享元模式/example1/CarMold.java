package design_pattern.享元模式.example1;

import lombok.Setter;

/**
 * 汽车模具类，包含模具的参数信息
 *
 * @author : liudy23
 * @data : 2023/4/25
 */
@Setter
public class CarMold {

    /**
     * 模具的形状
     */
    private String shape;

    /**
     * 模具的材料
     */
    private String material;

    public void produceCar(String brand) {
        System.out.println("生产一辆" + brand + "品牌的汽车，模具形状：" + shape + "，模具材料：" + material);
    }
}
