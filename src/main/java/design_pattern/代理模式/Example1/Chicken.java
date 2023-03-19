package design_pattern.代理模式.Example1;

/**
 * @author : liudy23
 * @data : 2023/3/19
 */
public class Chicken implements Animal{

    @Override
    public void call() {
        System.out.println("叽、叽、叽");
    }

    @Override
    public void behavior() {
        System.out.println("跑和飞");
    }
}
