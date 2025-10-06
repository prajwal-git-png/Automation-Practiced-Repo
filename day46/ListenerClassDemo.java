package day46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ListenerClassDemo {
    WebDriver driver ;

    @BeforeClass
    void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    void testLogo(){
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status, true);

    }

    @Test(priority = 4 )
    void testUrl(){
        Assert.assertEquals(driver.getCurrentUrl() , "https://opensource-demo.orangehrmlive.com");
    }

    @Test(priority = 2, dependsOnMethods = {"testUrl"})
    void testTitle(){
        Assert.assertEquals(driver.getTitle() , "OrangeHRM");
    }
}
