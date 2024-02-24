package paralleTesting;

import org.testng.annotations.Test;

public class Parallel {

    @Test
    void first(){
        System.out.println(1);
    }

    @Test
    void second(){
        System.out.println(2);
    }
}
