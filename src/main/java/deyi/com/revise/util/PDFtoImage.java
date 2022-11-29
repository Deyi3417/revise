package deyi.com.revise.util;

import com.spire.pdf.PdfDocument;
import com.spire.pdf.graphics.PdfImageType;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Arrays;

public class PDFtoImage {
    public static void main(String[] args) throws IOException {
//        PdfDocument pdfDocument = new PdfDocument();
//        pdfDocument.loadFromFile("D:\\File_liudy23\\test\\test02.pdf");
////        pdfDocument.getConvertOptions().setPdfToImageOptions(100);
//        for (int i = 0; i < pdfDocument.getPages().getCount(); i++) {
//            BufferedImage image = pdfDocument.saveAsImage(i);
//            File file = new File(String.format("D:\\File_liudy23\\test\\ToImage%d.png", i));
//            ImageIO.write(image, "PNG", file);
//        }
//        pdfDocument.close();
        pdfToImage02();
        pdfToImage04();

    }

    public static void pdfToImage02() throws IOException {
        PdfDocument pdfDocument = new PdfDocument();
//        pdfDocument.loadFromStream(in);
        pdfDocument.loadFromFile("D:\\File_liudy23\\test\\test02.pdf");
//        BufferedImage bufferedImage = pdfDocument.saveAsImage(0);
        BufferedImage bufferedImage = pdfDocument.saveAsImage(0, PdfImageType.Bitmap, 500, 500);
//        PDDocument pdDocument = PDDocument.load(Base64Utils.decodeFromString(base64String));
//        PDFRenderer pdfRenderer = new PDFRenderer(pdDocument);
//        BufferedImage bufferedImage = pdfRenderer.renderImage(0);
        ImageIO.write(bufferedImage,"png", new File("D:\\File_liudy23\\test\\ToImage71.png"));
    }
// HttpServletResponse response
    public static void pdfToImage03(HttpServletResponse response) throws IOException {
        PdfDocument pdfDocument = new PdfDocument();
        pdfDocument.loadFromFile("D:\\File_liudy23\\test\\test02.pdf");
        BufferedImage bufferedImage01 = pdfDocument.saveAsImage(0);



        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage01,"png", os);
        byte[] bytes = os.toByteArray();
        System.out.println(Arrays.toString(bytes));
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(bytes, 0, bytes.length);
//        PDDocument pdDocument = PDDocument.load(Base64Utils.decodeFromString(base64String));
//        PDFRenderer pdfRenderer = new PDFRenderer(pdDocument);
//        BufferedImage bufferedImage = pdfRenderer.renderImage(0);
//        ImageIO.write(bufferedImage,"png", new File("ToImage.png"));
    }


    public static void pdfToImage04() throws IOException {
        InputStream is = new FileInputStream("D:\\File_liudy23\\test\\test02.pdf");
        PDDocument pdDocument = PDDocument.load(is);
        PDFRenderer pdfRenderer = new PDFRenderer(pdDocument);
        BufferedImage bufferedImage = pdfRenderer.renderImage(0,5);
         pdfRenderer.renderImageWithDPI(0,350);
        ImageIO.write(bufferedImage,"png", new File("D:\\File_liudy23\\test\\ToImage70.png"));
        is.close();
    }

    public void process(BufferedImage image, int dpi) {


    }
}
