package day44;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependencyTesting {

       /*  1) Login    -- @BeforeMethod
        2) Search   -- @Test
        3) Logout    -- @AfterMethod
        4) Login
        5) Advanced search -- @Test
        6) Logout
*/

    @Test
    void login(){
        Assert.fail("Engine not working!");
        System.out.println("login successful");
    }
    @Test(dependsOnMethods = {"login"})
    void search(){
        System.out.println("search successful");
    }

    @Test(dependsOnMethods = {"login"})
    void advSearch(){
        System.out.println("Adv Search");
    }
    @Test(dependsOnMethods = {"login"} , alwaysRun = true)
    void logout(){
        System.out.println("logout successful");
    }
}
