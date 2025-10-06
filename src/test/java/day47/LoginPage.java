package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;
    //    CONSTRUCTOR
    LoginPage(WebDriver driver){
        this.driver = driver;


    }

//    LOCATOR
   By user_name= By.xpath("//input[@placeholder='Username']");
   By pass_textBox= By.xpath("//input[@placeholder='Password']");
   By loginButton= By.xpath("//button[normalize-space()='Login']");




//    ACTIONS
public void enterUsername(String set_name){
    driver.findElement(user_name).sendKeys(set_name);
}

public void enterPassword(String set_pass){
    driver.findElement(pass_textBox).sendKeys(set_pass);
}

public void click_Button(){
    driver.findElement(loginButton).click();
}

}
