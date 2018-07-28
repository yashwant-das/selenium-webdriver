import org.testng.annotations.Test;

public class DataProviderInOtherClass {
    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String param){
        System.out.println(param);
    }
}
