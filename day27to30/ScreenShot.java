package day27to30;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class ScreenShot {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sc = ts.getScreenshotAs(OutputType.FILE);
//        File target = new File("C:\\Users\\prajw\\IdeaProjects\\SeleniumPrjkt\\src\\test\\java\\day37\\file\\screenshot.png");
//        File target = new File(System.getProperty("user.dir") + "\\file\\screenshot.png");
//        sc.renameTo(target);


//        Capture the screenshot of specific section
        WebElement table = driver.findElement(By.xpath("(//div[@id='HTML1'])[1]"));
        File source =  table.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "\\src\\test\\java\\day37\\file\\TableScreenshot.png");

        source.renameTo(target);



    }
}
