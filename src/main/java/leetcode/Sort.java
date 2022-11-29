package leetcode;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {9,8,8,1,1,5,5,3,4,1,7};
        sort(arr);
    }

    private static void sort(int[] array) {
        //外层循环控制排序的趟数
        for(int i=0;i<array.length-1;i++){
            //内层循环控制每趟排序内的次数逐渐递减
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        System.out.println("res:" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
