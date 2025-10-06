package day42;

import org.apache.logging.log4j.core.net.Priority;
import org.testng.annotations.Test;

public class FirstTestCase {
    /*
    * 1   OPEN THE APP
    * 2   LOGIN
    * 3   LOGOUT
    *
    */
    @Test(priority = 1)
    void open(){
        System.out.println("Opening app");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("Login app");
    }
    @Test(priority = 3)
    void logout(){
        System.out.println("LogOff app");
    }


}
