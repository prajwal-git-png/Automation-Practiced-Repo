package day13to15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePick2 {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0); // datepicker inside iframe

// open date picker
        driver.findElement(By.id("datepicker")).click();

// select month
        Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
        month.selectByVisibleText("September");

// select year
        Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
        year.selectByVisibleText("2005");

// select date
        driver.findElement(By.xpath("//a[text()='29']")).click();

    }
}
