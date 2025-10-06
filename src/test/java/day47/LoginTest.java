package day47;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @Test
    void testLogin(){
//      LoginPage login = new LoginPage(driver);
      LoginPage2 login = new LoginPage2(driver);
      login.enterUsername("Admin");
      login.enterPassword("admin123");
      login.click_Button();
      Assert.assertEquals(driver.getTitle() , "OrangeHRM");

    }
    @AfterClass
    void tearDown(){
     driver.quit();
    }
}
