import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParellelExecution {
    @BeforeMethod
    public void setUp() {
        System.out.println("Setup");

    }

    @Test
    public void testOne() {
        System.out.println("Test 1");
    }

    @Test
    public void testTwo() {
        System.out.println("Test 2");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("TearDown");

    }
}
