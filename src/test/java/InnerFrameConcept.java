import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrameConcept {
    public static void main(String[] args) {
        // Handling the innerChildFrames -->
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");
        WebElement buttonElement = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
        buttonElement.click();
        // So question is how to go inside the inner frame , means ek frame ke inside me ek aur frame.
        // so we need to go child frame.
        /**
         * 1 -> We need to switch to Parent frame,then to the child frame, because directly we can not jump to child frame
         */
        WebElement parentFrame = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
        driver.switchTo().frame(parentFrame);
        /**
         * Child frame webElement and Switch into it
         */
        WebElement childFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(childFrame);

        WebElement textBoxInChildFrame = driver.findElement(By.xpath("//input[@type='text']"));
        textBoxInChildFrame.sendKeys("TestTest");

        // Imp
        driver.switchTo().defaultContent();

        WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[1]/a"));
        homeButton.click();
        //driver.close();

    }
}
