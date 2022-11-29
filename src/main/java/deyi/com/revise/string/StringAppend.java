package deyi.com.revise.string;

public class StringAppend {
    public static void main(String[] args) {
        stringAppend();
    }
    public static void stringAppend() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append("S001-0712" + i + ",");
        }
        /*
        if (i==3) {
                sb.append("S001-0712" + i);
                continue;
            }
         */
        System.out.println(sb);
        String s = sb.toString();
        System.out.println("s:" + s);
        s.lastIndexOf(",");
        String substring = s.substring(0, s.lastIndexOf(","));
        System.out.println("sub:" + substring);
    }
}
