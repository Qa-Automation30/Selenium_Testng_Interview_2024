package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {

    @Test(dataProvider = "testData",dataProviderClass = DataClass.class)
    void testCase(String fName, String lName){
        System.out.println(fName+"-----"+lName);
    }
}
