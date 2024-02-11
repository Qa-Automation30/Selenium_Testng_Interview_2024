import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle_1 {

    WebDriver driver;
    WebDriverWait webDriverWait;
    @BeforeMethod
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver","H:\\SeleniumImp\\chromedriver.exe");
        webDriverWait = new WebDriverWait(driver ,20);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://omayo.blogspot.com");
    }
    @Test
    public void handleWindow() throws InterruptedException {
       String firstWindow = driver.getWindowHandle();

       driver.findElement(By.linkText("Open a popup window")).click();
       Thread.sleep(3000);

       Set<String> windows = driver.getWindowHandles();
      Iterator<String> it = windows.iterator();
      while (it.hasNext())
      {
          String childWindow = it.next();
          driver.switchTo().window(childWindow);
      }
      System.out.println(driver.getTitle());
      driver.quit();
    }
}
