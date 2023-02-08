package learning_review.basic;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

/**
 * @author : HP
 * @date : 2023/1/11
 */
@Slf4j
public class ArraysType {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("liudy23", "suyao", "chun", "long");
        System.out.println(stringList);
        log.error("考勤记录推送失败: {}","deyi");

    }
}
