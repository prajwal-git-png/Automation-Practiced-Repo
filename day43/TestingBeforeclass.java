package day43;

import org.testng.annotations.*;

public class TestingBeforeclass {

    /*  1) Login    -- @BeforeClass
        2) Search   -- @Test
        3) Advanced search -- @Test
        4) Logout    -- @AfterClass
   */

    @BeforeClass
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
    @AfterClass
    void logout(){
        System.out.println("logout successful");
    }
}
