package day1to3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitMethods {
    public static void main(String[] args) {
        System.out.println("Hello");
//        1) Wait using Thread.sleep();
//        2 )wait using implicit
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        3 ) explicit
//                declaration --
//                    WebDriverWait  mywait =  new WebDriverWait(driver ,Duration.ofSeconds(10));
//                initialization --
//                    mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user-name")));
//         4) Fluent wait

        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> flu = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10));

        WebDriverWait  mywait =  new WebDriverWait(driver ,Duration.ofSeconds(10));
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("user-name")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
}