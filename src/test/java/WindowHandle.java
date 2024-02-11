import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {

    WebDriver driver;
    @BeforeMethod
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver","H:\\SeleniumImp\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
    }
    @Test
    public void handleWindow() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Follow @Lambdatesting on Twitter']")).click();
       String parentWindow = driver.getWindowHandle();
       System.out.println("parentWindow-->"+parentWindow);

      Set<String> windows = driver.getWindowHandles();
      Iterator<String> it = windows.iterator();
      String childWindow= it.next();
      driver.switchTo().window(it.next());
      System.out.println("childWindow-->"+childWindow);
      Thread.sleep(2000);
    }
    @AfterMethod
    public void terDown()
    {
        driver.quit();
    }
}
