import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Server {
    public WebDriver driver;
    public String url = "https://www.seleniumhq.org";
    public String hubUrl = "http://localhost:4444/wd/hub";

    @BeforeTest
    public void loadingSetUp() throws MalformedURLException {
        //Keep the Chrome Driver in Selenium Standalone JAR folder
        driver = new RemoteWebDriver(new URL(hubUrl), new ChromeOptions());
    }

    @AfterTest
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void severDemo(){
        driver.get(url);
    }
}