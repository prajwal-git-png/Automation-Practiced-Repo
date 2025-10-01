package day40;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src/test/java/day40/Book1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int totalRows = sheet.getLastRowNum();
        int totalCell = sheet.getRow(1).getLastCellNum();
        System.out.println("Number of rows : " + totalRows );
        System.out.println("Number of cells : " + totalCell );

        for (int r = 0 ; r <=totalRows; r++){
            XSSFRow currentRow = sheet.getRow(r);
            for (int c =0 ; c < totalCell ; c++){
                XSSFCell cell = currentRow.getCell(c);
                System.out.print( "\t"+ cell.toString()  +  "\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();


    }
}
