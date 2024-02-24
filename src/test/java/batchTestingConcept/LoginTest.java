package batchTestingConcept;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    void loginByMobileNumber(){
        System.out.println("Logged in via mobile number passed");
    }

    @Test
    void loginByEmail(){
        System.out.println("Logged in via email passed");
    }
}
