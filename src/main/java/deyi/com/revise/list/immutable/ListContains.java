package deyi.com.revise.list.immutable;

import java.util.Arrays;
import java.util.List;

/**
 * @author : HP
 * @date : 2023/5/30
 */
public class ListContains {
    public static final String[] QC_OUTSOURCING_LOGO = {"CEL","MIX","COA","LAM","STA","INJ","WIN","MCA","FGM","WHL","MPL","GZT","TEG","IRS","NMM","SYR","NMC","NMD","NMG","SPE"};
    public static void main(String[] args) {
        List<String> targetLogo = Arrays.asList(QC_OUTSOURCING_LOGO);
        System.out.println(targetLogo);
        boolean coa = targetLogo.contains("COA");
        System.out.println(coa);
        System.out.println("---------------");

        String targetString = "COA199505243417";
        boolean b = targetLogo.stream().anyMatch(targetString::contains);
        System.out.println(b);
        System.out.println("====================");
        anyMatch();
    }

    public static void anyMatch() {
        List<Integer> targetNums = Arrays.asList(1, 8, 98, 5, 46, 33, 9, 30, 45);
        boolean flag = targetNums.stream().anyMatch(num -> num > 100);
        System.out.println("anyMatch:" + flag);
    }
}
