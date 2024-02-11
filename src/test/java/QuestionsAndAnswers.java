import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionsAndAnswers {
    WebDriver driver = new ChromeDriver();

    public void setDriver(WebDriver driver) {
        driver.navigate().back();  // Back button on browser
        driver.navigate().forward(); // Forward button on browser
        driver.navigate().refresh(); // refresh the page

        driver.navigate().to("www.google.com");
        driver.get("www.amazon.com");
        /**
         * diff b/w  -->   driver.navigate().to("www.google.com");  AND   driver.get("www.amazon.com");
         * ============================================================================================
         *  get() --> method is used to navigate to the URL and wait until the page load
         *
         *  navigate().to() -> This will also navigate to the URL, but it does not wait to load a page.
         *  It maintains browser history so that it can move forward and backward direction.
         */
        //====================================================================================
    }
}
