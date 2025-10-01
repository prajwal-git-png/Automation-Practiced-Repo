package day13to15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class BestWayDatePicker {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement pointer = driver.findElement(By.xpath("(//button[normalize-space()='Point Me'])[1]"));
        WebElement laptop = driver.findElement(By.xpath("(//a[normalize-space()='Mobiles'])[1]"));
        Actions act = new Actions(driver);
//        MOSE HOVER ACTION IS PERFORMED ON THIS
        act.moveToElement(pointer).moveToElement(laptop).build().perform();
        act.moveToElement(pointer).moveToElement(laptop).click().build().perform();




    }
}
