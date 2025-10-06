package day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
    @Test
    void pqr(){
        System.out.println("lass C3 pqr method");
    }
    @BeforeSuite
    void bs(){
        System.out.println("Before suite from C3");
    }
    @AfterSuite
    void as(){
        System.out.println("After suite form C3");
    }
}

