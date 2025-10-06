package day5to7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FramesTopic {
    static void main(String[] args) {
//https://ui.vision/demo/webtest/frames/
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");
//----------Basic method ---------------
//        driver.switchTo().frame(0);
//        driver.findElement(By.cssSelector("input[name='mytext1']")).sendKeys("hello");

//        WebElement frame1 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
//        driver.switchTo().frame(frame1);
//        driver.findElement(By.cssSelector("input[name='mytext1']")).sendKeys("fame1");
//
//        driver.switchTo().defaultContent();

//        WebElement frame2 = driver.findElement(By.cssSelector("frame[src='frame_2.html']"));
//        driver.switchTo().frame(frame2);
////        driver.switchTo().frame(1);
//        driver.findElement(By.cssSelector("input[name='mytext2']")).sendKeys("fame2");

//        WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
//        driver.switchTo().frame(frame3);
//        driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("Frame3");
//        driver.switchTo().frame(0);
//        driver.findElement(By.cssSelector("label[for='i9'] div[class='bzfPab wFGF8']")).click();


        WebElement frame5 = driver.findElement(By.cssSelector("frame[src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.cssSelector("a[href='https://a9t9.com']")).click();

        driver.switchTo().defaultContent();

    }
}
