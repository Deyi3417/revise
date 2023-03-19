package design_pattern.装饰者模式.Example2.decorate.method_2;

import design_pattern.装饰者模式.Example2.MilkTeam;

import java.math.BigDecimal;

/**
 * 奶茶配料的接口
 *
 * @author : liudy23
 * @data : 2023/3/19
 */
public interface MilkTeamIngredients extends MilkTeam {

    public String isVip();

}
