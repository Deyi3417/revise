package deyi.com.revise.springbootsource;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author : HP
 * @date : 2022/10/19
 */
public class Number implements Serializable {

    private static final long serialVersionUID = -1007251838117199236L;

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("a");
        stringList.add("1");
        stringList.add("2");
        stringList.add("b");
        stringList.add("c");
        stringList.add("c");
        stringList.add("3");
        stringList.add("2");
        System.out.println(stringList);

        LinkedHashSet<String> hset = new LinkedHashSet<>();
        hset.addAll(stringList);
        System.out.println(hset);
        stringList.clear();
        stringList.addAll(hset);
        System.out.println("stringList : " + stringList);
        hset.add("s");
        if (hset.contains("s")) {
            System.out.println("hset 包含字符串 s");
        }



    }
}
