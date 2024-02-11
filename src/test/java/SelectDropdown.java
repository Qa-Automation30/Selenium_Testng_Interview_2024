import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectDropdown {

    WebDriver driver;
    @Test
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","H:\\SeleniumImp\\seleniumtestng\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.orangehrm.com/en/contact-sales/");
        WebElement element = driver.findElement(By.id("Form_getForm_Country"));

        WebDriverWait webDriverWait = new WebDriverWait(driver,30);
        webDriverWait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
        Select select = new Select(element);
        select.selectByValue("Anguilla");
        select.selectByIndex(2);
        select.selectByVisibleText("Bolivia");
    }
    @Test
    public void setupAgain()
    {
        System.setProperty("webdriver.chrome.driver","H:\\SeleniumImp\\seleniumtestng\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.orangehrm.com/en/contact-sales/");
        WebElement element = driver.findElement(By.id("Form_getForm_Country"));

        WebDriverWait webDriverWait = new WebDriverWait(driver,30);
        webDriverWait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
        Select select = new Select(element);
        // If you do not want to use preDefined methods which used above. So how can you select the valued from dropdown
        List<WebElement> list = select.getOptions();

        for(WebElement elements :list){
            if(elements.getText().equals("Bolivia"))
            {
                elements.click();
                break;
            }
        }
    }

}
