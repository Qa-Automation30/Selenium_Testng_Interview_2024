package dynamicTableHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableInHandling {

    @Test
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        // First count total number of rows in a table->
       List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
       System.out.println("Total number of rows in table->"+(rows.size()-1));

       //Now count number of columns in table->
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
        System.out.println("Total number of columns in table->"+(columns.size()));

        // get the data from specific row and column
       System.out.println(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]")).getText());

       //retrieve all the data from the table
        for(int i=2;i<=rows.size();i++)
        {
            for(int j=1;j<=columns.size();j++)
            {
                WebElement element = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));
                String str = element.getText();
               System.out.println(str);
            }
            System.out.println();
        }
        driver.quit();
    }
}
