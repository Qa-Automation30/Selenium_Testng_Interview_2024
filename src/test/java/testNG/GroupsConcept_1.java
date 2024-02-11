package testNG;

import org.testng.annotations.Test;

public class GroupsConcept_1 {
    @Test(groups = { "smoke", "checkintest" })
    public void testMethod1() {
        System.out.println("smoke and checkintest");
    }

    @Test(groups = {"sanity", "checkintest"} )
    public void testMethod2() {
        System.out.println(5);
    }

    @Test(groups = { "regression" })
    public void testMethod3() {
        System.out.println(6);
    }
}
