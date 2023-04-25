package design_pattern.享元模式.example1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 汽车模具享元工厂类
 *
 * @author : liudy23
 * @data : 2023/4/25
 */
public class CarMoldFactory {

    private Map<String, CarMold> carMolds = new ConcurrentHashMap<>();

    public CarMold getCarMold(String shape, String material) {
        // 生成缓存的键值
        String key = shape + "_" + material;
        // 从缓存中获取模具
        CarMold carMold = carMolds.get(key);
        // 如果缓存中没有对应的模具对象，则创建新的模具对象并放入缓存
        if (carMold == null) {
            carMold = new CarMold();
            carMold.setShape(shape);
            carMold.setMaterial(material);
            carMolds.put(key, carMold);
        }
        return carMold;
    }
}
