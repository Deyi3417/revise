package design_pattern.adapter;

/**
 * 适配器模式
 *
 * @author : HP
 * @date : 2022/12/16
 */
public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电：" + output + "V");
        return output;
    }
}
