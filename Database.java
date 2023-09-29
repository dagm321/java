import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Database {
    public void database() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "password");
         
         Statement statement = connection.createStatement();

         String sql = "CREATE TABLE users (id INT NOT NULL AUTO_INCREMENT, username VARCHAR(255) NOT NULL UNIQUE, password VARCHAR(255) NOT NULL, PRIMARY KEY (id))";

         statement.execute(sql);

         statement.close();
         connection.close();
         throw new Error("error");
    }
        public static void main(String[] args) {

    }

}
