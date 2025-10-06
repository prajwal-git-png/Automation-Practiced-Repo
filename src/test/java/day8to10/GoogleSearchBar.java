package day8to10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class GoogleSearchBar {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement drpDown = driver.findElement(By.name("q"));
        drpDown.sendKeys("selenium");
        List<WebElement> results = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        for (WebElement elem : results){
            System.out.println(elem.getText());
            if (elem.getText().equals("selenium dev"));
            {
                elem.click();
                break;
            }
        }
    }
}
