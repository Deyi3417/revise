package deyi.com.learning;

import io.swagger.annotations.ApiModel;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author : HP
 * @date : 2023/3/24
 */
@ApiModel("省份城市信息")
public class AreaManager {
    private HashMap<Province, HashSet<City>> map;

    public AreaManager() {
        map = new HashMap<Province, HashSet<City>>();
        HashSet<City> bj = new HashSet<City>();
        bj.add(new City(1,"北京市",1));
        map.put(new Province(1,"北京市"),bj);

        HashSet<City> hn = new HashSet<City>();
        hn.add(new City(1,"海口市",2));
        hn.add(new City(2,"三亚市",2));
        map.put(new Province(2,"海南省"), hn);

        HashSet<City> zj = new HashSet<City>();
        zj.add(new City(1,"绍兴市",3));
        zj.add(new City(2,"温州市",3));
        zj.add(new City(3,"湖州市",3));
        zj.add(new City(4,"嘉兴市",3));
        zj.add(new City(5,"台州市",3));
        zj.add(new City(6,"金华市",3));
        zj.add(new City(7,"舟山市",3));
        zj.add(new City(8,"衢州市",3));
        zj.add(new City(9,"丽水市",3));
        map.put(new Province(3,"浙江省"), zj);
    }

    public HashSet<City> findCity(int pid) {
        for (Province province : map.keySet()) {
            if (province.getId() == pid) {
                return map.get(province);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AreaManager test = new AreaManager();
        HashSet<City> city = test.findCity(3);
        System.out.println(city);
    }
}
