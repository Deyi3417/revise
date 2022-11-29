package deyi.com.revise.string;

public class SplitString {
    public static void main(String[] args) {
        String[] array = {"007","deyi","suyao","chiyan","009"};

        StringBuilder sb = new StringBuilder();
        for (String str : array) {
            sb.append(str + ",");
        }
        System.out.println("liudy23测试：" + sb.toString());
        String newStr = sb.toString();
        String substring = newStr.substring(0, newStr.lastIndexOf(","));
        System.out.println("liudy23测试2：" + substring);
        String[] split = substring.split(",");
        for (String ss: split) {
            System.out.println(ss);
        }
    }
}
