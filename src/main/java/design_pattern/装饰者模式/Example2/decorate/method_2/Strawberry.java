package design_pattern.装饰者模式.Example2.decorate.method_2;

import design_pattern.装饰者模式.Example2.MilkTeam;

import java.math.BigDecimal;

/**
 * @author : liudy23
 * @data : 2023/3/19
 */
public class Strawberry implements MilkTeamIngredients{
    private MilkTeam milkTeam;

    public Strawberry(MilkTeam milkTeam) {
        this.milkTeam = milkTeam;
    }

    @Override
    public String getDescription() {
        return milkTeam.getDescription() + "，加草莓";
    }

    @Override
    public BigDecimal cost() {
        return milkTeam.cost().add(new BigDecimal(12).setScale(2, BigDecimal.ROUND_HALF_UP));
    }

    @Override
    public String isVip() {
        return "不是vip";
    }
}
