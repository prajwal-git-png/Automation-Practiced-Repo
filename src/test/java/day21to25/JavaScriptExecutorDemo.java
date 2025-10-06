package day21to25;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorDemo {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement elm = driver.findElement(By.xpath("//input[@id='name']"));
        WebElement male = driver.findElement(By.xpath("(//input[@id='male'])[1]"));

        JavascriptExecutor js  = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value' , 'Prajjwal')",elm);
        js.executeScript("arguments[0].click()",male);



    }
}
