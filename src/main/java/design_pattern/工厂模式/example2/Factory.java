package design_pattern.工厂模式.example2;

/**
 * 工厂方法模式示例
 *
 * @author 刘德意
 */
public interface Factory {
    public Product createProduct(String type);
}