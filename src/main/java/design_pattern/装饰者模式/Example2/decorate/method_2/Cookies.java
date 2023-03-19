package design_pattern.装饰者模式.Example2.decorate.method_2;

import design_pattern.装饰者模式.Example2.MilkTeam;

import java.math.BigDecimal;

/**
 * @author : liudy23
 * @data : 2023/3/19
 */
public class Cookies implements MilkTeamIngredients{
    private MilkTeam milkTeam;

    public Cookies(MilkTeam milkTeam) {
        this.milkTeam = milkTeam;
    }

    @Override
    public String getDescription() {
        return milkTeam.getDescription() + "，加曲奇饼干";
    }

    @Override
    public BigDecimal cost() {
        return milkTeam.cost().add(new BigDecimal(7.8).setScale(2, BigDecimal.ROUND_HALF_UP));
    }

    @Override
    public String isVip() {
        return "是vip";
    }
}
