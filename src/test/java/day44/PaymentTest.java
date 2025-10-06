package day44;

import org.testng.annotations.Test;

public class PaymentTest {
   @Test(priority = 1, groups = {"sanity" , "regression" , "functional"})
    void paymentByrs(){
        System.out.println("Payment in rupees");
    }
   @Test(priority = 2 ,  groups = {"sanity" , "regression" , "functional"})
    void paymentByCard(){
        System.out.println("Payment in Card");
    }
}
