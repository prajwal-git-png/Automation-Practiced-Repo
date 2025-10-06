package day16to20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://text-compare.com/");
        driver.findElement(By.name("text1")).sendKeys("Hello Prajwal How are you !!");
//        TIME TO PERFORM SOME ACTION USING KEYS
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();



    }
}
