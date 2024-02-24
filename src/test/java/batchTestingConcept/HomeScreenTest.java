package batchTestingConcept;

import org.testng.annotations.Test;

public class HomeScreenTest {
    @Test
    void LaunchApp(){
        System.out.println("App Launched");
    }
    @Test
    void verifyTitle(){
        System.out.println("title verified");
    }
    @Test
    void verifyLogo(){
        System.out.println("logo verified");
    }
}
