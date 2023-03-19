package design_pattern.代理模式.Example1;

/**
 * @author : liudy23
 * @data : 2023/3/19
 */
public class AnimalProxy implements Animal{
    private Animal target;

    public AnimalProxy(Animal target) {
        this.target = target;
    }

    @Override
    public void call() {
        long startTime = System.nanoTime();
        this.target.call();
        long endTime = System.nanoTime();
        System.out.println(this.target.getClass().getName() + ".call 方法的耗时（纳秒）：" + (endTime - startTime));
    }

    @Override
    public void behavior() {
        long startTime = System.nanoTime();
        this.target.behavior();
        long endTime = System.nanoTime();
        System.out.println(this.target.getClass().getSimpleName() + ".behavior 方法的耗时（纳秒）：" + (endTime - startTime));
    }
}
