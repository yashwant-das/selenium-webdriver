import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInSameClass {
    @Test(dataProvider = "data-provider")
    public void testMethod(String param){
        System.out.println(param);
        System.out.println("+++++++++++++");
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod(){
        return new Object[][]{
                {"first set of data"},
                {"second set of data"},
                {"third set of data"}
        };
    }
}
