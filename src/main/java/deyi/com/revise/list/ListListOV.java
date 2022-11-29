package deyi.com.revise.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListListOV {
    public static void main(String[] args) {
        Random random = new Random();
        List<Object> objectList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integerList.add(random.nextInt(100));
        }
        for (int i = 0; i < 3; i++) {
            objectList.add(integerList);
        }
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
        System.out.println(objectList);

        List<Integer> integerList1 = integerList.subList(0, 3 + 1);
        System.out.println(integerList1);
    }
}
