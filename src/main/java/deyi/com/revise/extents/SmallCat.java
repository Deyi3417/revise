package deyi.com.revise.extents;

/**
 * @Author HP
 * @create 2021/10/20 16:07
 *
 *      des:可以使用 instanceof 运算符来检验 Cat 和 SmallCat 对象
 *      是否是 Animal 类的一个实例。
 */
public class SmallCat extends Cat {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        SmallCat smallCat = new SmallCat();

        System.out.println(animal instanceof Animal);
        System.out.println(cat instanceof Animal);
        System.out.println(smallCat instanceof Animal);
    }
}
