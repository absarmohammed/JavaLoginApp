package src.BackEnd;
import java.sql.*;

public class LoginLogic {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/login_db","root",""
                );
            

            String query = "SELECT *FROM user";
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt("ID") + " " + rs.getString("Name") + " " + rs.getInt("ID") );
            }

            con.close();
        }

        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }    

    
    
}
