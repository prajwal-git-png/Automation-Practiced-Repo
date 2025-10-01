package day40;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataInExcel {
    static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("src/test/java/day40/Book2.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sheet2");

        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("welcome");
        row1.createCell(1).setCellValue(123);
        row1.createCell(2).setCellValue(122);
        row1.createCell(3).setCellValue("java");

        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("welcome2");
        row2.createCell(1).setCellValue(1);
        row2.createCell(2).setCellValue(1);
        row2.createCell(3).setCellValue("java2");

      workbook.write(file);
      workbook.close();
      file.close();
    }
}
