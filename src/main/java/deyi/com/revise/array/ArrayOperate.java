package deyi.com.revise.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HP
 * @date 2022-07-29
 */
public class ArrayOperate {
    public static void main(String[] args) {
        Integer[] array = {1,43,7,2,3,1,8,0};
        List<Integer> targetList = new ArrayList<>();
        targetList.add(1);
        targetList.add(8);
        targetList.add(3);
        System.out.println("targetList:" + targetList);
        List<Integer> ints = new ArrayList<>();
        for (int num : array) {
            ints.add(num);
        }
        System.out.println("ints:" + ints);
        for (Integer num : targetList) { 
            if (ints.contains(num)) {
                ints.remove(ints.indexOf(num));
            }
        }

        System.out.println(ints.toString());
    }
}
