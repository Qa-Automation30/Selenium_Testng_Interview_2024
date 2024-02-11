package SanitySuite;

import org.testng.annotations.Test;

/**
 * Jenkins userName and password
 * It will run on this URL: http://localhost:8080/
 *   userName : codeTest
 *   Password : Admin@12345
 */
public class SanityOne {
    @Test
    void sanityOne_1(){
        System.out.println("sanityOne_1");
    }
    @Test
    void sanityOne_2(){
        System.out.println("sanityOne_2");
    }
}
