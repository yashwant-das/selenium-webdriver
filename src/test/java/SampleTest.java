import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends Setup {
    @Test
    public void firstTest() {
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google Search Page Loaded Successfully");
    }
}
