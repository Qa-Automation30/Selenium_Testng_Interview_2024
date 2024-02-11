package SanitySuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SanityTwo {
    @Test
    void sanityTwo_1(){
        Assert.assertTrue(false);
        System.out.println("sanityTwo_1");
    }
    @Test
    void sanityTwo_2(){
        System.out.println("sanityTwo_2");
    }
}
