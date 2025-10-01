package day11to12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tablehandling {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
//        fin the total number of elements
      int row =  driver.findElements(By.xpath("//table[@name= 'BookTable']//tr")).size();
        System.out.println("Number of rows :" + row);


      int itemcol =  driver.findElements(By.xpath("//table[@name= 'BookTable']//th")).size();
        System.out.println("Number of columns :" + itemcol);

//       For specific data
        String element =  driver.findElement(By.xpath("//table[@name= 'BookTable']//tr[5]//td[1]")).getText();
        System.out.println("Number of columns :" + element);

//        for whole row

//        String elements =  driver.findElements(By.xpath("//table[@name= 'BookTable']//tr//td[1]"));
           for (int r = 2 ; r <= row ; r++ ){
               for (int c = 1 ; c <= itemcol ; c++){
                String value =   driver.findElement(By.xpath("//table[@name= 'BookTable']//tr["+ r+"]//td[" +c+" ]")).getText();
                   System.out.println(value + "\t");
               }
               System.out.println("\t");
           }
    }
}
