package day2to6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlinkCheckBox {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        System.out.println("Number of checkBox  " + checkBox .size());

//        for (WebElement link : checkBox ){
//            link.click();
//            Thread.sleep(1000);
//        }
//        which only select from 4
//        for (int i =4 ; i< checkBox.size() ;i++ ){
//              checkBox.get(i).click();
//        }
//     select unslected

        for (int i =4 ; i< checkBox.size() ;i++ ){
            checkBox.get(i).click();
        }

        for (int i =0 ; i< checkBox.size() ;i++ ){
            if (checkBox.get(i).isSelected()){
               checkBox.get(i).click();

            }
        }







    }
}
