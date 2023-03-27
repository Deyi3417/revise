package deyi.com.revise.stream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        // 添加浙江省及其下属城市
        List<String> zhejiangCities = Arrays.asList("绍兴市", "温州市", "湖州市", "嘉兴市", "台州市", "金华市", "舟山市", "衢州市", "丽水市");
        map.put("浙江省", zhejiangCities);

        // 添加海南省及其下属城市
        List<String> hainanCities = Arrays.asList("海口市", "三亚市");
        map.put("海南省", hainanCities);

        // 添加北京市及其下属城市
        List<String> beijingCities = Arrays.asList("北京市");
        map.put("北京市", beijingCities);

        // 遍历Map并打印所有省份及其下属城市
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
