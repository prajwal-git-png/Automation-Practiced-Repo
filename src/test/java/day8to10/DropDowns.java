package day8to10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDowns {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement drpDown = driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCty = new Select(drpDown);

//     METHOD 1 -- SELECT BY TEXT
        drpCty.selectByVisibleText("France");

//     METHOD 2 -- SELECT BY VALUE
        drpCty.selectByValue("canada");

//     METHOD  3 -- SELECT BY INDEX
        drpCty.selectByIndex(2);

//     CAPTURE THE NUMBER OF OPTIONS
        List<WebElement> numberOfOptions =  drpCty.getOptions();
        System.out.println(numberOfOptions.size());
//    PRINT THE OPTIONS
    for( WebElement opt :numberOfOptions){
        System.out.println(opt.getText());
    }
    }
}
