import org.testng.annotations.Test;

public class TestBelongsToMultiGroup {
    @Test(groups = {"sanity-group"})
    public void testOne()
    {
        System.out.println("Test1 - This test belongs to Sanity");
    }

    @Test(groups = {"sanity-group", "regression-group"})
    public void testTwo()
    {
        System.out.println("This test is belongs to Sanity & Regression");
    }

    @Test(groups = {"sanity-group"})
    public void testThree()
    {
        System.out.println("Test2 - This test belongs to Sanity");
    }
}
