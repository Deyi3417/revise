package design_pattern.装饰者模式.Example2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 具体的组件
 *
 * @author : liudy23
 * @data : 2023/3/18
 */
public class Lemonade implements MilkTeam {
    @Override
    public String getDescription() {
        return "柠檬水";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(4.5).setScale(2, RoundingMode.HALF_UP);
    }
}
