package deyi.com.revise.algorithm;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> nums = Arrays.asList(1,8,5,3,91,7,66);
        // Collections.sort(nums);
        System.out.println(nums);
        int kthLargest = solution.findKthLargest(nums, 3);
        System.out.println(kthLargest);
    }

    /*
    堆排序算法可以使用一个小根堆来维护当前的前K大元素。
    首先将前K个元素插入小根堆中，然后遍历剩余的元素，如果比堆顶元素大就将其插入堆中，
    并将堆顶元素弹出，保证堆中元素数量始终为K。遍历完成后，堆顶元素即为第K大的元素。时间复杂度为O(nlogK)。
     */
    public int findKthLargest(List<Integer> nums, int k) {
        if (nums == null || nums.size() < k || k <= 0) {
            return -1;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums.get(i));
        }
        for (int i = k; i < nums.size(); i++) {
            if (nums.get(i) > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums.get(i));
            }
        }
        return minHeap.peek();
    }
}
