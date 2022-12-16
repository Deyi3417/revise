package design_pattern.adapter;

import deyi.com.revise.common.Color;

import java.util.Arrays;

/**
 * @author : HP
 * @date : 2022/12/16
 */
public class AdapterPattern {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
        String color = Color.blue.getColor();
        String name = Color.red.getName();
        System.out.println("color:" + color + "  name:" +name);
        Color[] values = Color.values();
        System.out.println(Arrays.toString(values));
        String purple = Color.valueOfColor("紫");
        System.out.println("颜色color:" + purple);
        String yellow = Color.valueOfName("yellow");
        System.out.println("颜色name:" + yellow);

    }
}
