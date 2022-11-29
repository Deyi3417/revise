package deyi.com.revise.algorithm;

import java.util.Arrays;

/**
 * @author : HP
 * @date : 2022/8/15
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 8, 1, 1, 5, 5, 3, 4, 1, 7};
        System.out.println("arr: " + Arrays.toString(arr));
        int[] res = bubbleSort(arr);
        System.out.println("res: " + Arrays.toString(res));
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
