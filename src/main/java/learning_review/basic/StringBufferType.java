package learning_review.basic;

/**
 * @author : HP
 * @date : 2023/1/11
 */
public class StringBufferType {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("qing");
        System.out.println(sb);

        // 字符串改变了，自身也会跟着改变
        StringBuffer reverse = sb.reverse();
        System.out.println(sb);
        System.out.println(reverse);



    }
}
