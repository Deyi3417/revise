package leetcode;

/**
 * @Author liudy23
 * @Create 2022/2/7 9:31
 * 整数数组 nums 按升序排列，数组中的值 互不相同
 * 搜索旋转排序数组
 */
public class SortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 2;
        int result = search(nums, target);
        System.out.println("result:" + result);
    }

    public static int search(int[] nums, int target){
        int length = nums.length;// 数组为空
        if (length == 0){
            return -1;
        }// 数组单一值
        if (length == 1){
            return nums[0] == target ? 0 : -1;
        }// 数组多个值
        int left = 0, right = length - 1;
        while (left <= right){
            int mid = (left + right) / 2; // 3
            if (nums[mid] == target){
                return mid;
            }
            if (nums[0] <= nums[mid]){
                if (nums[0] <= target && target < nums[mid]){
                    right = mid - 1;
                }else {
                    // 左边没有，往右边找
                    left = mid + 1;
                }
            }else {
                if (nums[mid] < target && target <= nums[length - 1]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
