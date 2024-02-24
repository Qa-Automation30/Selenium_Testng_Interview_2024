package batchTestingConcept;

import org.testng.annotations.Test;

public class PaymentTest {
    @Test
    void cashOnDelivery(){
        System.out.println("cashOnDelivery passed");
    }

    @Test
    void netBanking(){
        System.out.println("netBanking passed");
    }
}
