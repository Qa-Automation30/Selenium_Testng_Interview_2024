import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Frames {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        /**
         * If an element is present inside the frame then it does not get the element directly , so you need
         * to switch to the frame and then get the element.
         */
        driver.switchTo().frame("packageListFrame");  // Switch to the frame via it's name
        // driver.switchTo().frame(0); // Switch to the frame via it's index
        // then click on the element which present inside the frame-->
        driver.findElement(By.xpath("//a[text()='org.openqa.selenium']/parent::li")).click();
        /**
         * So imp point is that if you are in frame already, and you want to switch to another frame, so you need to come out from the 1st frame, and
         * then you need to switch to another frame.
         */
        driver.switchTo().defaultContent(); // Go back to the main page and then perform the below operation
        // Now if you want to access the element from the second frame, so need to switch to second frame and the access the element
        driver.switchTo().frame("packageFrame");
        System.out.println(driver.findElement(By.xpath("//a[text()='AbstractDriverOptions']")).getText());

        driver.switchTo().defaultContent();

    }
}
