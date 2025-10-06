package day47;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
    WebDriver driver;
//    CONSTRUCTOR
    LoginPage2(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver ,this );


    }

//    LOCATOR
@FindBy (xpath = "//input[@placeholder='Username']") WebElement name;
@FindBy (xpath = "//input[@placeholder='Password']") WebElement pass;
@FindBy (xpath = "//button[normalize-space()='Login']") WebElement button;

//    ACTIONS
    public void enterUsername(String set_name){
       name.sendKeys(set_name);
    }

    public void enterPassword(String set_pass){
       pass.sendKeys(set_pass);
    }

    public void click_Button(){
       button.click();
    }
}
