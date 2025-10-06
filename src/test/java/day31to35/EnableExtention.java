package day31to35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.File;

public class EnableExtention {
    static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        File file = new File("src/test/java/day38/SelectorHub/SelectorsHub.crx");
        options.addExtensions(file);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://text-compare.com/");

    }
}
