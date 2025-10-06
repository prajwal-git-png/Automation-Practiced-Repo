package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionClassDemo {
    @Test
    void testTitle()
    {
            String actual_title = "Opencart";
            String result_title = "OpenShop";

//            Assert.assertEquals(actual_title , result_title);

            if (actual_title.equals(result_title)){
                System.out.println("Test passed");
                Assert.assertTrue(true);
            }
            else {
                System.out.println("Test Failed");
                Assert.assertFalse(false);
            }

    }
}
