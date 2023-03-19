package design_pattern.装饰者模式.Example2;

import java.math.BigDecimal;

/**
 * 组件接口
 *
 * @author : liudy23
 * @data : 2023/3/18
 */
public interface MilkTeam {

    String getDescription();

    BigDecimal cost();
}
