import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUpload extends Setup {
    String filepath = "/Users/YashwantDas/Desktop/Selenium/fileToUpload.txt";
    String htmlWebPage = "file:///Users/YashwantDas/Dropbox/IntelliJIDEA/seleniumwebdriver/testData/fileUpload.html";

    @Test
    public void fileUpload() throws InterruptedException {
        //Loading Webpage
        driver.get(htmlWebPage);
        Thread.sleep(10000);

        WebElement fileInput = driver.findElement(By.name("uploadfile"));
        fileInput.sendKeys(filepath);
        Thread.sleep(10000);

    }
}
