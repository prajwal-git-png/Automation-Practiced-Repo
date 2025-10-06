package day16to20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderUsingJava {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Actions act = new Actions(driver);
        WebElement minSlide = driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
        WebElement maxSlide = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));

        System.out.println(minSlide.getLocation().getX());
        System.out.println(maxSlide.getLocation().getX());
//        act.dragAndDropBy(minSlide , 970 , 2024).build().perform();
        act.dragAndDropBy(minSlide, 50, 0).perform();  // only X-axis
        act.dragAndDropBy(maxSlide, 50, 0).perform();  // only X-axis

        System.out.println(minSlide.getLocation());
        System.out.println(maxSlide.getLocation());
    }
}
