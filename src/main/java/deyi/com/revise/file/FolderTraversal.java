package deyi.com.revise.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 快速遍历文件夹
 *
 * @author : HP
 * @date : 2023/4/6
 */
public class FolderTraversal {
    public static void main(String[] args) {
        System.out.println("E".equals("E"));
        System.out.println("E"=="E");
    }

    public static void getAllFiles01() throws IOException {
        // 1. 需求：打印文件夹内所有文件名称（含子集）
        Files.walk(Paths.get("D:\\az"), 1).forEach(System.out::println);
    }

    public static void getAllFiles02() {
        // 2. 注意事项 (1)try-with-resources (2) 遍历结果包括文件夹
        try(Stream<Path> pathStream = Files.walk(Paths.get("src"))) {
            pathStream.filter(Files::isRegularFile).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
