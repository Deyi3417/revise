package deyi.com.revise.strOperation;

/**
 * @Author HP
 * @create 2021/12/9 17:25
 */
public class strSubString {
    public static void main(String[] args) {
        //\Downloads/TEMP/TEMPNESTFILE\W211126Q345B25A1.txt
        //D:/temp/download\W211126Q345B25A1.txt
        String url_01 = "D:/temp/download\\W211126Q345B25A1.txt";
        String url_02 = "\\Downloads/TEMP/TEMPNESTFILE\\W211126Q345B25A1.txt";
        int index_01 = url_01.lastIndexOf("\\");
        int index_02 = url_02.lastIndexOf("\\");
        String substring_01 = url_01.substring(index_01 + 1);
        String substring_02 = url_01.substring(index_01 + 1, url_01.length());
        System.out.println(substring_01);
        System.out.println(substring_02);

        String substring_03 = url_02.substring(index_02 + 1);
        String substring_04 = url_02.substring(index_02 + 1, url_02.length());
        System.out.println(substring_03);
        System.out.println(substring_04);



    }
}
