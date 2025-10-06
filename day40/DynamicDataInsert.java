package day40;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DynamicDataInsert {
    static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("src/test/java/day40/Book3.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("book3");
//        XSSFRow row = sheet.createRow(0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of ROWs");
        int numOfRow = sc.nextInt();
        System.out.println("Enter Number of Columns");
        int numOfCol = sc.nextInt();

        for (int row =0 ; row <= numOfRow ; row++){
            XSSFRow currentRow =sheet.createRow(row);
            for (int col= 0 ; col <= numOfCol ; col++){
                System.out.println("Enter the data ");
                XSSFCell currentCell = currentRow.createCell(col);

                currentCell.setCellValue(sc.next());
            }

        }
        workbook.write(file);
        workbook.close();
        file.close();


    }
}
