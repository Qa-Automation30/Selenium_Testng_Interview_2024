package testNG;

import org.testng.annotations.Test;

public class GroupsConcept {
    @Test(groups = { "functest", "checkintest" })
    public void testMethod1() {
        System.out.println(1);
    }

    @Test(groups = {"functest", "checkintest"} )
    public void testMethod2() {
        System.out.println(2);
    }

    @Test(groups = { "functest" })
    public void testMethod3() {
        System.out.println(3);
    }
}
