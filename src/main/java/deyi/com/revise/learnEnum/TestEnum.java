package deyi.com.revise.learnEnum;

/**
 * @author : HP
 * @date : 2023/2/3
 */
public class TestEnum {
    public static void main(String[] args) {
        String name = TypeEnum.getNameByCode(9);
        System.out.println("color：" + name);
    }
}
