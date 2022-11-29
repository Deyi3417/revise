package deyi.com.revise.watermark;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * @author HP
 * @create 2022/6/10 8:26
 */
public class WaterMark {
    public static void main(String[] args) throws IOException {
        Thumbnails.of("D:/File_liudy23/temp/test.png")
                .scale(1f).outputQuality(0.25f)
                .outputFormat("jpg").toFile("D:/File_liudy23/temp/target.jpg");

        Thumbnails.of("D:/File_liudy23/temp/test.png")
                .scale(0.1f).outputQuality(1.0f)
                .outputFormat("jpg").toFile("D:/File_liudy23/temp/target02.jpg");

        Thumbnails.of("D:/File_liudy23/temp/test.png")
                .size(300, 200)
                .watermark(Positions.CENTER, ImageIO.read(new File("D:/temp/watermark.png")), 0.5f)
                .toFile("D:/File_liudy23/temp/target06.png");
        
    }



}
