package testNG;

import org.testng.annotations.*;

public class ClassThree {
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("I am in before Suite_Demo_1");
    }
    @BeforeTest()
    public void beforeTest()
    {
        System.out.println("I am in before Test_Demo_1");
    }
    @BeforeClass
    void beforeClass()
    {
        System.out.println("I am in beforeClass_Demo_1");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("I am in before Method_Demo_1");
    }
    @Test
    void testMethod1()
    {
        System.out.println("Test-1");
    }
    @Test
    void testMethod2()
    {
        System.out.println("Test-2");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("After Method_Demo_1");
    }
    @AfterTest
    void afterTest()
    {
        System.out.println("After Test_Demo_1");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class_Demo_1");
    }
    @AfterSuite
    void afterSuite()
    {
        System.out.println("After Suite_Demo_1");
    }
}
