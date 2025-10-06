package day41;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class ExampleForDataUtility {

    static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        String path = System.getProperty("user.dir") + "/src/test/java/day41/Book1.xlsx";



        int rows = UtilityAuto.getRowCount(path , "sheet1");

        for (int i = 1; i <= rows; i++) {
          String princ=   UtilityAuto.getCellData(path,"Sheet1", i,0);
          String rateOfinterest=   UtilityAuto.getCellData(path,"Sheet1", i,1);
          String period1=   UtilityAuto.getCellData(path,"Sheet1", i,2);
          String period2=   UtilityAuto.getCellData(path,"Sheet1", i,3);
          String fre=   UtilityAuto.getCellData(path,"Sheet1", i,4);
          String exp_mv_value = UtilityAuto.getCellData(path, "Sheet1" ,i ,5);

          driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
          driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfinterest);
          driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);

            Select predrp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
            predrp.selectByVisibleText(period2);

            Select fredrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
            fredrp.selectByVisibleText(fre);

          driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();


          //       VALIDATIONS
          String actual_mv_value =  driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

          if (Double.parseDouble(exp_mv_value) == Double.parseDouble(actual_mv_value)) {
              System.out.println("Test Passed");
              UtilityAuto.setCellData(path , "Sheet1" , i,7 ,"Passed" );
              UtilityAuto.fillGreenColor(path,"Sheet1" ,i,7);
          }else {
              System.out.println("Test Failed");
              UtilityAuto.setCellData(path , "Sheet1" , i,7 ,"Failed" );
              UtilityAuto.fillRedColor(path,"Sheet1" ,i,7);
          }

          driver.findElement(By.cssSelector("img[class='PL5']")).click();

        }

  driver.close();




    }
}
