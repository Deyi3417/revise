package deyi.com.revise.zip;

import com.spire.pdf.PdfDocument;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipToBinaryExample {
    public static void main(String[] args) throws IOException {
        File zipFile = new File("D:\\tmp\\tempfile.zip"); // 假设这里有一个本地的 zip 文件
        FileInputStream fileInputStream = new FileInputStream(zipFile);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fileInputStream.read(buffer)) > 0) {
            byteArrayOutputStream.write(buffer, 0, len);
        }
        fileInputStream.close();
        byteArrayOutputStream.close();
        byte[] binaryData = byteArrayOutputStream.toByteArray();
        System.out.println("binaryData: " + binaryData.toString());

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(binaryData);
        ZipInputStream zipInputStream = new ZipInputStream(byteArrayInputStream);
        ZipEntry zipEntry;
        while ((zipEntry = zipInputStream.getNextEntry()) != null) {
            System.out.println(zipEntry.getName());
            if (!zipEntry.getName().endsWith("pdf")) {
                System.out.println(zipEntry.getName() + "  =-=-=");
                continue;
            }

        }


    }
}
