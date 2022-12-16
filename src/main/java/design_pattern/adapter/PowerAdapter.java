package design_pattern.adapter;

/**
 * @author : HP
 * @date : 2022/12/16
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220;

    // 生成构造方法
    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        // 变压器
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V" + "\n"
        + "输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
