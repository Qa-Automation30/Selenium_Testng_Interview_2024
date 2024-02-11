package testNG;

import org.testng.annotations.*;

public class ClassTwo {
    @BeforeClass
    void BeforeClass()
    {
        System.out.println("this is the BeforeClass in ClassTwo");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("this is the AfterClass in ClassTwo");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("this is the beforeMethod in ClassTwo");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("this is the afterMethod in ClassTwo");
        System.out.println("-------");
    }
    @Test
    void testMethod_1()
    {
        System.out.println("this is the testMethod_1 in ClassTwo");
    }
    @Test
    void testMethod_2()
    {
        System.out.println("this is the testMethod_2 in ClassTwo");
    }
}
