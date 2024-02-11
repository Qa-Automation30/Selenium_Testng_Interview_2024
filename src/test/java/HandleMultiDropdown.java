import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleMultiDropdown {
    public static void main(String[] args) {
        String [] arr ={"New Jersey","New York","Washington"};
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");

        Select select = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
        for(int i =0;i<arr.length;i++){
            select.selectByValue(arr[i]);
        }

        List<WebElement> allOptions = select.getAllSelectedOptions();
        for(WebElement element:allOptions)
        {
            System.out.println(element.getText());
        }

    }
}
