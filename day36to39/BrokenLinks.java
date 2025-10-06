package day36to39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of Links : " + links.size());

        int brokenCount = 0;
        int validCount = 0;

        for (WebElement link : links) {
            String hrefValue = link.getAttribute("href");

            if (hrefValue == null || hrefValue.isEmpty()) {
                System.out.println("Skipping invalid link: " + hrefValue);
                continue;
            }

            try {
                URL urlLink = new URL(hrefValue);
                HttpURLConnection conn = (HttpURLConnection) urlLink.openConnection();
                conn.connect();

                if (conn.getResponseCode() >= 400) {
                    System.out.println("Broken link: " + hrefValue);
                    brokenCount++;
                } else {
                    validCount++;
                }
            } catch (MalformedURLException e) {
                System.out.println("Malformed URL: " + hrefValue);
                brokenCount++;
            } catch (IOException e) {
                System.out.println("Error connecting to: " + hrefValue);
                brokenCount++;
            }
        }

        System.out.println("Broken links = " + brokenCount + " | Correct links = " + validCount);

        driver.quit();
    }
}
