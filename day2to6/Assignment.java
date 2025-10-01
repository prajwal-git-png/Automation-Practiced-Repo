package day2to6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
//        selenium
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));

        System.out.println("Number of links " + links.size());

        for (WebElement link : links){
            link.click();
            Thread.sleep(1000);
        }

        Set<String> windowId = driver.getWindowHandles();
        for (String winId : windowId){
            System.out.println("Windows id : "  + winId);
        }
        for (String winTd : windowId){
            driver.switchTo().window(winTd);
            if (driver.getTitle().equals("Selenium in biology - Wikipedia")){
               driver.close();
            }
        }



    }
}
