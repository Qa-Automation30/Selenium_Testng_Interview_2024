import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class CookieTest {

    WebDriver driver;

    @Test
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        /**
         * getCookies()  -> This method return all the cookies and stored in a set format
         * basically get all the cookies from the browser.
         */
        Set<Cookie> cookies = driver.manage().getCookies();
        /**
         * Check the size of cookies
         */
        System.out.println(cookies.size());
        /**
         * Now print all the cookies
         */
        for(Cookie _c : cookies)
        {
            System.out.println(_c.getName() +"--"+_c.getValue()+"--"+_c.getDomain());
        }
        /**
         * Add a cookie to the browser -->
         */
        driver.manage().addCookie(new Cookie("MyAddedCookie","1234"));
        cookies = driver.manage().getCookies();
        System.out.println(cookies.size());
        for(Cookie _c : cookies)
        {
            System.out.println(_c.getName() +"--"+_c.getValue()+"--"+_c.getDomain());
        }
        driver.close();
    }
}
