package dataProvider;

import org.testng.annotations.DataProvider;

public class DataClass {

    @DataProvider(name="testData")
    public static Object[][] passData(){
        Object[][] objTest = new Object[2][2];
        objTest[0][0] = "Jhon";
        objTest[0][1] ="Cena";

        objTest[1][0] ="The";
        objTest[1][1]="Rock";
        return objTest;
    }
}
