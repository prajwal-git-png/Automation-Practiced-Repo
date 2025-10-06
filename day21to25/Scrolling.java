package day21to25;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Scrolling {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
//        WebElement elm = driver.findElement(By.xpath(""));

        JavascriptExecutor js  = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0 ,30)" , "");
        System.out.println(js.executeScript("return window.pageYOffset" , ""));


    }
}
