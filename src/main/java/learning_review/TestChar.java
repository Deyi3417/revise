package learning_review;

/**
 * @author : HP
 * @date : 2022/11/29
 */
public class TestChar {
    public static void main(String[] args) {
        TestChar testChar = new TestChar();
        testChar.testPlus();
    }

    void testPlus() {
        int c;
        c = 5;
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c);
    }

    /**
     * 1.最大的区别是，==是运算符，equal是方法
     * ==比较的是内存地址，因为a和b是new出来的，是两个不同的对象，所以地址肯定是不同的，而equal比较的是值\
     *
     * 3. 比较String类型
     * ==比较的是内存地址，equal比较的是值
     */
    public void testString() {
        String s1 = new String("deyi is so handsome");
        System.out.println("s1:" + s1);
        String s2 = new String("deyi is so handsome");
        System.out.println("s2:" + s2);
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2)");
        }
        if (s1 == s2) {
            System.out.println("s1 == s2");
        }

        String s3 = "liudy23";
        String s4 = "liudy23";
        System.out.println("s3 == s4  " + (s3 == s4));
        System.out.println("s3.equals(s4)  " + s3.equals(s4));


    }



    public void testASCII() {
        char a = 'h';
        System.out.println(a);
        int i = 100;
        int j = 97;
        // 转化为ASCII码进行计算 并且 a对应的ASCII码为97
        int aa = a + i;
        System.out.println(aa);
        System.out.println((char)j);
    }

    void testIf(int x) {
        if (x == 0) {
            System.out.println("冠军");
        } else if (x > -3) {
            System.out.println("亚军");
        } else {
            System.out.println("季军");
        }
    }
}
