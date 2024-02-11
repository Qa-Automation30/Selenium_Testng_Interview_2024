package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassOne {
    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("this is the beforeMethod");
    }
    @Test
    void testMethod_1()
    {
        System.out.println("this is the testMethod_1");
    }
    @Test
    void testMethod_2()
    {
        System.out.println("this is the testMethod_2");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("this is the afterMethod");
        System.out.println("-------");
    }
}
