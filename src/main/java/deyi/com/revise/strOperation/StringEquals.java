package deyi.com.revise.strOperation;

import java.util.ArrayList;
import java.util.List;

public class StringEquals {
    public static void main(String[] args) {
        String str = "1";
        Object a = 2.2;
        if (str.equals(String.valueOf(a))){
            System.out.println("deyi");
        }
        if (a == Integer.valueOf(str)){
            System.out.println("deyi\uD83D\uDCC4");
        }

        // 全删掉dlt = 1;
        Double aDouble = Double.valueOf((Double) a);
        System.out.println(aDouble);
        if (aDouble==0){
            System.out.println("double:"+aDouble);
        }
        ArrayList list = new ArrayList();
        list.add(0,"deyi");
        list.add(1,"suyao");
        System.out.println(list);

        String str02 = "1,4,6,2,5,2,56";
        String[] split = str02.split(",");
        List<String> arr = new ArrayList<>();
        for (String s : split) {
            arr.add(s);
        }
        System.out.println(arr);

    }
}
