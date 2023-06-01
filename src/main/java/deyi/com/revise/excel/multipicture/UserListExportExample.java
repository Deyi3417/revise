package deyi.com.revise.excel.multipicture;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.Units;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserListExportExample {
    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        List<User> userList = getUserList(); // 获取List<User>数据

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("用户列表");
        // 创建表头
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("用户名");
        headerRow.createCell(1).setCellValue("性别");
        headerRow.createCell(2).setCellValue("电话");
        headerRow.createCell(3).setCellValue("邮箱");
        headerRow.createCell(4).setCellValue("地址");
        headerRow.createCell(5).setCellValue("图片");
        // 创建样式，用于设置最后一列为图片格式
        CellStyle imageCellStyle = workbook.createCellStyle();
        imageCellStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        imageCellStyle.setAlignment(CellStyle.ALIGN_CENTER);
        // 加载图片并插入到单元格
        for (int i = 0; i < userList.size(); i++) {
            Row row = sheet.createRow(i + 1);
            User user = userList.get(i);
            // 插入其他数据
            row.createCell(0).setCellValue(user.getUserName());
            row.createCell(1).setCellValue(user.getGender());
            row.createCell(2).setCellValue(user.getPhone());
            row.createCell(3).setCellValue(user.getEmail());
            row.createCell(4).setCellValue(user.getAddress());


            // 插入多张图片
            List<String> pictures = user.getPictures();
            int pictureCount = pictures.size();

            // 设置行高
            row.setHeightInPoints(90f);

            for (int j = 0; j < pictureCount; j++) {
                String picturePath = pictures.get(j);
                FileInputStream imageStream = new FileInputStream(picturePath);
                byte[] imageBytes;
                try {
                    imageBytes = IOUtils.toByteArray(imageStream);
                } catch (Exception e) {
                    e.printStackTrace();
                    continue;
                }
                int pictureIdx = workbook.addPicture(imageBytes, Workbook.PICTURE_TYPE_JPEG);
                Drawing drawing = sheet.createDrawingPatriarch();
                CreationHelper helper = workbook.getCreationHelper();
                ClientAnchor anchor = helper.createClientAnchor();
                anchor.setCol1(6 + j);
                anchor.setRow1(i + 1);
                Picture picture = drawing.createPicture(anchor, pictureIdx);
                // 计算图片的缩放比例
                float scale = 0.04f;
                // 设置行高
                row.setHeightInPoints(90f);
                // 设置图片缩放
                picture.resize(scale);
            }
//
//            Cell imageCell = row.createCell(5);
//            imageCell.setCellStyle(imageCellStyle);
//            imageCell.setCellValue("");
        }

        // 自动调整列宽
        for (int i = 0; i < 6; i++) {
            sheet.autoSizeColumn(i);
//            if (i != 5) {
//                sheet.autoSizeColumn(i);
//            } else {
//                sheet.setColumnWidth(i,20*256);
//            }
        }

        // 导出Excel文件
        try (FileOutputStream outputStream = new FileOutputStream("D:\\tmp\\activiti\\output2.xlsx")) {
            workbook.write(outputStream);
            System.out.println("Excel导出成功！");
            long endTime = System.currentTimeMillis();
            // 计算运行时间（以秒为单位）
            long elapsedTimeMillis = endTime - startTime;
            double elapsedTimeSeconds = elapsedTimeMillis / 1000.0;

            // 打印运行时间
            System.out.println("程序运行时间：" + elapsedTimeSeconds + "秒");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static List<User> getUserList() {
//        return Arrays.asList(
//                new User("刘德意", "1", "18811553417-----18811553417@163.com-", "18811553417@163.com", "18811553417@163.com18811553417@163.com18811553417@163.com", Arrays.asList("D:\\tmp\\activiti\\ldylsy.jpg", "D:\\tmp\\activiti\\liudy23.jpg")),
//                new User("liudy23-------", "1--------", "18811553417", "18811553417@163.com18811553417@163.com18811553417@163.com", "hunan", Arrays.asList("D:\\tmp\\activiti\\liudy23.jpg", "D:\\tmp\\activiti\\ldylsy.jpg", "D:\\tmp\\activiti\\liudy23.jpg")),
//                new User("落苏谣", "1", "18811553417", "18811553417@163.com", "湖南", Arrays.asList("D:\\tmp\\activiti\\liudy23.jpg", "D:\\tmp\\activiti\\ldylsy.jpg"))
//        );
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            User user = new User("落苏谣", "1", "18811553417", "18811553417@163.com", "湖南", Arrays.asList("D:\\tmp\\activiti\\liudy23.jpg", "D:\\tmp\\activiti\\ldylsy.jpg"));
            users.add(user);
        }
        return users;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class User {
    private String userName;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private List<String> pictures;

    // 构造方法、getter和setter方法

    // 示例代码省略其他部分
}
