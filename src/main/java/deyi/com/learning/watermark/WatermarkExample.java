package deyi.com.learning.watermark;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WatermarkExample {

    public static void main(String[] args) {
        String imagePath = "C:\\Users\\HP\\Desktop\\PIC\\fileToImg.png";
        String watermarkText = "liudy23 80048349 SANY TECH";
        int spacing = 400; // 水印之间的间距

        try {
            // 读取原始图片
            BufferedImage image = ImageIO.read(new File(imagePath));
            Graphics2D g2d = (Graphics2D) image.getGraphics();
            AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.1f);
            g2d.setComposite(alphaComposite);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Font arial = new Font("微软雅黑", Font.BOLD, 60);
            g2d.setFont(arial);
            g2d.setColor(Color.RED);


            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(watermarkText);
            int textHeight = fontMetrics.getHeight();

            int imageWidth = image.getWidth();
            int imageHeight = image.getHeight();

            System.out.println("====textWidth:" + textWidth + "====textHeight:" + textHeight);
            int spacingX = (int) (1.5 * textWidth);
            int spacingY = (int) (5 * textHeight);
            int centerX = imageWidth / 2;
            int centerY = imageHeight / 2;
            g2d.rotate(Math.toRadians(-25),centerX, centerY);
            // 在图片的多个位置添加水印
            System.out.println("====imageHeight:" + imageHeight + "====imageWidth:" + imageWidth + "====spacingY:" + spacingY + "====spacingX:" + spacingX);
            for (int y = 0; y < imageHeight; y += spacingY) {
                for (int x = -imageWidth; x < imageWidth * 2; x += spacingX) {
                    g2d.drawString(watermarkText, x, y);
                }
            }

            // 将水印图像保存到文件
            String outputImagePath = "C:\\Users\\HP\\Desktop\\PIC\\outputImage3.png";
            ImageIO.write(image, "jpg", new File(outputImagePath));
            g2d.dispose();
            System.out.println("水印添加成功，已保存为：" + outputImagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
