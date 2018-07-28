import org.testng.Assert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {
    public static void main(String[] args) {

        int count = 0;

        Connection conn;
        String url = "jdbc:mysql://localhost:3306/";
        String databaseName = "selenium";
        String property = "?verifyServerCertificate=FALSE&useSSL=FALSE";
        String username = "root";
        String password = "inception";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url + databaseName + property, username, password);
            String sqlQuerry1 = "Select * from signupdetails";
            String sqlQuerry2 = "SELECT COUNT(*) FROM signupdetails";
            Statement statement = conn.createStatement();

            //Get the number of rows
            ResultSet rowCount = statement.executeQuery(sqlQuerry2);
            while (rowCount.next()){
                count = rowCount.getInt(1);
            }
            System.out.println("Number of row:"+count);

            ResultSet result = statement.executeQuery(sqlQuerry1);
            for (int i =1; i<=(count);i++) {
                result.next();
                System.out.println(result.getString("emailaddress"));
                System.out.println(result.getString("zipcode"));
                System.out.println(result.getString("firstname"));
                System.out.println(result.getString("lastname"));
            }
            //Assertions
            //Assert.assertEquals(result.getString("emailaddress"), "email1@gmail.com");

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
