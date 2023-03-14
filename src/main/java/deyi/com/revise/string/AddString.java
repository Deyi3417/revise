package deyi.com.revise.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : HP
 * @date : 2022/11/10
 */
public class AddString {
    public static void main(String[] args) {
        split();

    }

    static void joinString() {
        String str1 = "a";
        String str2 = "h";
        String str3 = "d";
        String str4 = "g";
        String join = String.join(",", str1, str2, str3, str4);
        System.out.println("join ===:" + join);

    }

    static void split() {
        String str = "1,8,8,1,3,4,2";
        String[] split = str.split(",");
        List<String> strings = new ArrayList<>(Arrays.asList(split));
        System.out.println(strings);

        List<String> resultList = new ArrayList<>(split.length);
        Collections.addAll(resultList,split);
        System.out.println(resultList);
    }
}
