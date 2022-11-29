package deyi.com.revise.algorithm;

import java.util.Arrays;

/**
 * @author : HP
 * @date : 2022/8/16
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {1,5,2,9,4,3,2};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("arr1:" + Arrays.toString(arr1));
        System.out.println("arr2:" + Arrays.toString(arr2));
        int[] sort = sort(arr1);
        System.out.println("sort: " + Arrays.toString(sort));


    }
    public static int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        // 总共要经过n-1次比较
        for (int i = 0; i < sourceArray.length - 1; i++) {
            int minIndex = i;
            // 每轮需要比较n-i次
            for (int j = i + 1; j < sourceArray.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}
