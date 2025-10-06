package day31to35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DisableAutomatedMessage {

    static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches" , new String[]{"enable-automation"});
//        Pass the 'options' into ChromeDriver()
        WebDriver driver = new ChromeDriver(options);
//        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        String Title = driver.getTitle();
        System.out.println(Title);
    }
}

