package SmokeSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeOne {
    @Test
    void smoke1(){
        Assert.assertTrue(false);
        System.out.println("smoke one");
    }
    @Test
    void smoke2(){
        System.out.println("smoke 2");
    }
}
