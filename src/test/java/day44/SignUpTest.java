package day44;

import org.testng.annotations.Test;

public class SignUpTest {
    @Test(priority = 1, groups = {"regression"})
    void signUpByEmail(){
        System.out.println("signUp by Email");
    }
    @Test(priority = 2, groups = {"regression"})
    void signUpFaceBook(){
        System.out.println("signUp by FaceBook");
    }
    @Test(priority = 3 , groups = {"regression"})
    void signUpTwitter(){
        System.out.println("signUp by Twitter");
    }
}
