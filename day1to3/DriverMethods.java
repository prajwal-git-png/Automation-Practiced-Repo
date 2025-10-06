package day1to3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class DriverMethods {
    public static void main(String []args){
        System.out.println("Hello");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
//        driver.getCurrentUrl();
//        driver.getPageSource();
//        driver.getWindowHandle();
        Set<String> window_ids = driver.getWindowHandles();



        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");



    }
}
