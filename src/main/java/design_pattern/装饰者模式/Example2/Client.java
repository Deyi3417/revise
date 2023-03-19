package design_pattern.装饰者模式.Example2;

import design_pattern.装饰者模式.Example2.decorate.method_1.NutDecorate;
import design_pattern.装饰者模式.Example2.decorate.method_1.PearlDecorate;
import design_pattern.装饰者模式.Example2.decorate.method_2.Cookies;
import design_pattern.装饰者模式.Example2.decorate.method_2.Strawberry;

import javax.servlet.http.Cookie;

/**
 * @author : liudy23
 * @data : 2023/3/19
 */
public class Client {
    public static void main(String[] args) {
        // 客户买奶茶
        MilkTeam boBoMilkTeam = new BoBoMilkTeam();
        boBoMilkTeam = new PearlDecorate(boBoMilkTeam);
        boBoMilkTeam = new Cookies(boBoMilkTeam);
        System.out.println("名称：" + boBoMilkTeam.getDescription() + "    售价：" + boBoMilkTeam.cost());

        MilkTeam lemonade = new Lemonade();
        lemonade = new NutDecorate(lemonade);
        lemonade = new Strawberry(lemonade);
        System.out.println(new Strawberry(lemonade).isVip());
        System.out.println("名称：" + lemonade.getDescription() + "    售价：" + lemonade.cost());
    }
}
