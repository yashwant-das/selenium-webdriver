import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Setup {
    public WebDriver driver;
    public String url = "http://www.google.com";

    @BeforeTest
    public void loadingSetUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() {
        //driver.quit();
    }
}
