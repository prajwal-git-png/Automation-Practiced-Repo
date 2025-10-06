package day2to6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigateExample {
    public static void main(String[] args) {
/*
 WE can use the navigational methods
 1) navigate().to()
 2) navigate().back()
 3) navigate().forward()
 4)navigate().refresh()

  */
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.navigate().to("https://www.dictionary.com/browse/hi");


    }
}
