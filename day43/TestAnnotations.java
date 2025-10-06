package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotations {
    /*  1) Login    -- @BeforeMethod
        2) Search   -- @Test
        3) Logout    -- @AfterMethod
        4) Login
        5) Advanced search -- @Test
        6) Logout
*/

    @BeforeMethod
    void login(){
        System.out.println("login successful");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("search successful");
    }

    @Test(priority = 2)
    void advSearch(){
        System.out.println("Adv Search");
    }
    @AfterMethod
    void logout(){
        System.out.println("logout successful");
    }

}


