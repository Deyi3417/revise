package deyi.com.revise.excel;

import cn.hutool.core.io.FileUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * @author 刘德意
 */
public class ExcelExportExample {
    public static void main(String[] args) throws FileNotFoundException {
        // 创建工作簿
        Workbook workbook = new XSSFWorkbook();
        
        // 创建工作表
        Sheet sheet = workbook.createSheet("数据表");

        // 加载图片
        FileInputStream imageStream = new FileInputStream(new File("D:\\tmp\\activiti\\liudy23.jpg"));

        byte[] imageBytes;
        try {
            imageBytes = IOUtils.toByteArray(imageStream);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // 创建图片并插入到单元格
        int pictureIdx = workbook.addPicture(imageBytes, Workbook.PICTURE_TYPE_JPEG);
        Drawing drawingPatriarch = sheet.createDrawingPatriarch();
        CreationHelper helper = workbook.getCreationHelper();
        ClientAnchor anchor = helper.createClientAnchor();
        anchor.setCol1(0);
        anchor.setRow1(0);
        Picture picture = drawingPatriarch.createPicture(anchor, pictureIdx);
        picture.resize();

        // 添加数据
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(0);
        cell.setCellValue("这是一张图片");

        // 导出Excel文件
        try (FileOutputStream outputStream = new FileOutputStream("D:\\tmp\\activiti\\output.xlsx")) {
            workbook.write(outputStream);
            System.out.println("Excel导出成功！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
