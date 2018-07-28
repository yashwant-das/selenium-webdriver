import org.testng.annotations.Test;

public class DependencyTestChild extends DependencyTestParent {
    @Test(dependsOnMethods = {"pqr"})
    public void abc(){
        System.out.println("Depends on pqr");
    }
}
