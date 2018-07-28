import org.testng.annotations.Test;

public class DependencyTestParent {
    @Test(dependsOnMethods = {"pqr"})
    public void abc(){
        System.out.println("Depends on pqr");
    }
    @Test
    public void pqr(){
        System.out.println("Depends on abc");
    }
}
