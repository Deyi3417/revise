package design_pattern.装饰者模式.Example2.decorate.method_1;

import design_pattern.装饰者模式.Example2.MilkTeam;

import java.math.BigDecimal;

/**
 * @author : liudy23
 * @data : 2023/3/19
 */
public class CoconutDecorate implements MilkTeam {

    private MilkTeam milkTeam;

    public CoconutDecorate(MilkTeam milkTeam) {
        this.milkTeam = milkTeam;
    }

    @Override
    public String getDescription() {
        return milkTeam.getDescription() + "，加椰果";
    }

    @Override
    public BigDecimal cost() {
        return milkTeam.cost().add(new BigDecimal(6).setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}
