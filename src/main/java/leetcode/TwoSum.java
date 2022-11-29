package leetcode;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author liudy23
 * @Create 2022/2/8 9:28
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 *
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 5;
        int[] ints = twoSum(nums, target);
        //打印数组的方式
        System.out.println("nums:" + Arrays.toString(nums));
        System.out.println("ints:" + Arrays.toString(ints));

        int[] ints1 = twoSum_2(nums, target);
        System.out.println("ints1:" + Arrays.toString(ints1));

    }

    public static int[] twoSum(int[] nums, int target){
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++){
                if (target == (nums[i] + nums[j])){
                    System.out.println("i:" + i + "\n" + "j:" + j);
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 哈希表
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum_2(int[] nums, int target){
        // 利用新的方法建立哈希map
        HashMap<Integer, Integer> map = Maps.newHashMap();
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            /*
                    nums-->map
                    key-->value
                    value-->key
             */
            map.put(nums[i], i);
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
        }
        return new int[0];
    }
}
