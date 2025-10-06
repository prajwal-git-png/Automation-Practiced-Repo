package day45;

import org.apache.poi.ss.formula.atp.Switch;
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

public class ParamTesting {

    WebDriver driver ;
    @Parameters({"browser" , "url"})
    @BeforeClass
    void setup(String br , String url) throws InterruptedException {
        switch(br)
        {
            case "chrome" : driver = new ChromeDriver(); break;
            case "edge" : driver = new EdgeDriver(); break;
            case "fire" : driver = new FirefoxDriver(); break;
            default:
                System.out.println("Invalid browser");
                return;

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    void testLogo(){
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status, true);

    }

    @Test(priority = 2)
    void testTitle(){
      Assert.assertEquals(driver.getTitle() , "OrangeHRM");
    }

    @Test(priority = 4)
    void testUrl(){
        Assert.assertEquals(driver.getCurrentUrl() , "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
