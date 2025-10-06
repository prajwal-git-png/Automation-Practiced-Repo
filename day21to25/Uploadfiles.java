package day21to25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Uploadfiles
{
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement up =  driver.findElement(By.id("singleFileInput"));
        up.sendKeys("C:\\Users\\prajw\\Pictures\\Screenshots\\Screenshot 2025-08-25 131909.png");
    }
}
