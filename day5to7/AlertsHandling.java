package day5to7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertsHandling {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");


// -------------------------------NORMAL ALERT WITH OK BUTTON----------------------------

//        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
//        Alert myAlert = driver.switchTo().alert();
//        System.out.println(myAlert.getText());
//        myAlert.accept();

//     -----------------------------------------------------------------------------------------

// -------------------------------  CONFIRMATION ALERT WITH OK BUTTON----------------------------

//        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
//        Alert confirmation = driver.switchTo().alert();
//        System.out.println(confirmation.getText());
//        confirmation.dismiss();

//     ------------------------------------------------------------------------------------------

// -------------------------------  CONFIRMATION ALERT WITH OK BUTTON----------------------------

        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Alert prompt = driver.switchTo().alert();
        System.out.println(prompt.getText());
        prompt.sendKeys("Hi pajji");
        prompt.accept();

//     ------------------------------------------------------------------------------------------

    }
}
