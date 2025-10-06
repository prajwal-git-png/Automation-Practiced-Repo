package day16to20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewWindowHandle {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");


    }
}
