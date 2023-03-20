package deyi.com.revise.list.immutable;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : HP
 * @date : 2023/3/14
 */
public class FilterList {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,3);
        Date addTime = instance.getTime();
        System.out.println("addTime:" + DateFormatUtils.format(instance.getTime(),"yyyy-MM-dd HH:mm:ss"));

        // test();
    }
    public static void test() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,6,6,3);
        List<Integer> collect = integerList.stream().filter(item -> {
            if (item.equals(6)) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println("===1===" + collect);

        List<Integer> collect1 = integerList.stream().filter(e -> !e.equals(6)).collect(Collectors.toList());
        System.out.println("===2===" + collect1);

        integerList.stream().forEach(item -> {
            if (item.equals(3)) {
                System.out.println("are you ok:" + 3);
            }
        });

        // 去重
        Set<Integer> collect2 = integerList.stream().collect(Collectors.toSet());
        System.out.println("-=-=:" + collect2);
    }
}
