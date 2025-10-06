package day40;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EditingData {
    static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("src/test/java/day40/Book4.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("book4");
//        XSSFRow row = sheet.createRow(0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  ROW to edit data");
        int numOfRow = sc.nextInt();
        System.out.println("Enter Column to edit data");
        int numOfCol = sc.nextInt();


        XSSFRow Row =sheet.createRow(numOfRow);
        XSSFCell currentCell = Row.createCell(numOfCol);

        System.out.println("Enter the data ");
        currentCell.setCellValue(sc.next());

        workbook.write(file);
        workbook.close();
        file.close();
    }
}
