import org.testng.annotations.Test;

public class TestBelongsToSingleGroup {
    @Test(groups = {"sanity-group"})
    public void testOne()
    {
        System.out.println("Test1 - This test belongs to Sanity");
    }

    @Test()
    public void testTwo()
    {
        System.out.println("This test does NOT belongs to Sanity");
    }

    @Test(groups = {"sanity-group"})
    public void testThree()
    {
        System.out.println("Test2 - This test belongs to Sanity");
    }
}
