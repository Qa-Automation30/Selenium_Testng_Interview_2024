import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestedDropdown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chorme.driver","H:\\SeleniumImp\\seleniumtestng\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        // Input something in Search box for Autosuggestion
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
        //get all the list from the dropdown
        List<WebElement> elements = driver.findElements(By.xpath("//ul/li[@class='sbct']//div[@role='option']//div[1]//span"));
        for(WebElement element :elements){
            if(element.getText().equals("Selenium webDriver")){
                element.click();
                break;
            }
        }

            }
}
//Note : BootStrap Dropdown can be handled via same as above.
