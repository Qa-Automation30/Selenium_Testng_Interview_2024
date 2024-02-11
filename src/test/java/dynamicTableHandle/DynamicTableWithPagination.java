package dynamicTableHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
// https://blog.qasource.com/software-development-and-qa-tips/how-to-resolve-element-click-intercepted-exception-in-selenium
//https://stackoverflow.com/questions/35989076/how-to-handle-movetargetoutofboundsexception-in-selenium-webdriver
public class DynamicTableWithPagination {

   @Test
    public void test() throws InterruptedException {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("https://demo.opencart.com/admin/index.php");
       driver.findElement(By.id("input-username")).sendKeys("demo");
       driver.findElement(By.id("input-password")).sendKeys("demo");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       Thread.sleep(9000);
       driver.findElement(By.xpath("//li[@id='menu-sale']/a")).click();

       driver.findElement(By.xpath("(//li[@id='menu-sale']/a/parent::li/ul/li/a)[3]")).click();

       // 1-> Now req to find the total number of pages here ->
      String totalNoOfPages = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
      System.out.println(totalNoOfPages);
      //This imp Section -->
      String totalNumberOfPages = totalNoOfPages.substring(totalNoOfPages.indexOf("(")+1, totalNoOfPages.indexOf("Pages")).trim();
      System.out.println(totalNumberOfPages);
      // what you have get total number of pages here it is in string format, so you need to convert that String into integer.
      int valueOfTotalPages = Integer.valueOf(totalNumberOfPages);
       System.out.println(valueOfTotalPages);

       // 2-> Now navigate to each and every page and count the number of rows
       for(int i=1;i<=valueOfTotalPages;i++)
       {
           // first need to find the active page->
          WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
          System.out.println("Active page ->"+active_page.getText());
          // here use the JS to click on an element
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].click",active_page);

           // now find the total number of rows
           List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr"));
           System.out.println("Total number of rows on a page is ->"+rows.size());

           // Now make the 2nd page as an active page.
           String pageNo= Integer.toString(i+1);

           WebElement _element = driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageNo+"']"));
           Actions actions = new Actions(driver);
           actions.moveToElement(_element).click().perform();
       }
      driver.quit();
   }
}
