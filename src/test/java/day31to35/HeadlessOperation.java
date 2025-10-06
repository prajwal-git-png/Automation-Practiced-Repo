package day31to35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HeadlessOperation {
    static void main(String[] args) {

        // IMPLEMENTING THE HEADLESS
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
//        Pass the 'options' into ChromeDriver()
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        String Title = driver.getTitle();
        if (Title.equals("Automation Testing Practice")){
            System.out.println("TEST CASE PASSED!");
        }else {
            System.out.println("TEST CASE FAILED! ");
        }

    }
}
