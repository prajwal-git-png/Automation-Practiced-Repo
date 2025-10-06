package day13to15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickAction {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//        WebElement pointer = driver.findElement(By.xpath("(//button[normalize-space()='Point Me'])[1]"));
//        WebElement laptop = driver.findElement(By.xpath("(//a[normalize-space()='Mobiles'])[1]"));
//        Actions act = new Actions(driver);
//        MOSE HOVER ACTION IS PERFORMED ON THIS
//

//        RIGHT CLICK OPERATION IS HERE
        WebElement right = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act =new Actions(driver);
        act.contextClick(right).build().perform();
//        COPY BUTTON CLICK
        WebElement copy = driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
        act.moveToElement(copy).click().build().perform();
        driver.switchTo().alert().accept();






    }
}
