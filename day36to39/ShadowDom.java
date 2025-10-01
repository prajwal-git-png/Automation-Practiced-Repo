package day36to39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowDom {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.get("https://dev.automationtesting.in/shadow-dom");

        SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
//        shadow.findElement(By.className("#shadow-element"));
        Thread.sleep(1000);

        SearchContext shadow1 = shadow.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
//        shadow1.findElement(By.className("#shadow-element"));
        Thread.sleep(1000);

        SearchContext shadow2 = shadow.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        shadow2.findElement(By.className("multi-nested-shadow-element"));


    }
}
