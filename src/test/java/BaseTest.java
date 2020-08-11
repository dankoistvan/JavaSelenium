import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "C:/Users/DraY/IdeaProjects/JavaSelenium/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://adimoldovan.github.io/demo-shop/#/");
    }
}
