package day2to6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BroserWindowHandles {
    public static void main(String[] args) {
/*

  */
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();
        Set<String> WindowId =  driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(WindowId);
        String parentId = windowList.get(0);
        String childId = windowList.get(1);
        System.out.println(parentId);
        System.out.println(childId);
        System.out.println(driver.getTitle());

    }
}
