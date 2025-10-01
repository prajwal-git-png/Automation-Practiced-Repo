package day13to15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");

// locate input box
        WebElement dateInput = driver.findElement(By.id("datePickerMonthYearInput"));

// clear and send value
        dateInput.clear();
        dateInput.sendKeys("09/29/2025");
        dateInput.sendKeys(Keys.ENTER);

    }
}
