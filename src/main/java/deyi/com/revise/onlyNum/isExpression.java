package deyi.com.revise.onlyNum;

/**
 * @Author liudy23
 * @Create 2022/1/20 20:46
 */
public class isExpression {
    public static void main(String[] args) {
        boolean flag = false;
        //1.使用三元表达式
        String str = flag ? "deyi" : "dehua";
        System.out.println(str);
        //2.利用 for-each 语句
        Integer[] arr = {1,8,8,1,1,5,5,3,4,1,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        for (Integer i : arr) {
            System.out.print(i+" ");
        }
        //3.
    }
}
