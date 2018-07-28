import org.testng.annotations.DataProvider;


public class DataProviderClass {

    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod()
    {
        return new Object[][]
                {
                        {"1st set of data"},
                        {"2nd set of data"}
                };
    }
}
