package batchTestingConcept;

import org.testng.annotations.Test;

public class ProductPageTest {
    @Test
    void addProductToWishList(){
        System.out.println("addProductToWishList passed");
    }

    @Test
    void addProductToCart(){
        System.out.println("addProductToCart passed");
    }
    @Test
    void selectQuantity(){
        System.out.println("selectQuantity passed");
    }
}
