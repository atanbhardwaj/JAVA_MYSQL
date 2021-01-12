package testconnectionmysql;
import java.sql.*;
public class Mysqlconnection {
    public static void main(String[] args)
    {
        Connection con=null;
        String url = "jdbc:mysql://localhost:3306/bookbd";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            con = DriverManager.getConnection(url, "root","");
            System.out.println("Connection Established");
        }catch(ClassNotFoundException c)
        {
            System.out.println("Exception"+c.getMessage());
        }catch (SQLException s)
        {
            System.out.println("MySQL Connection Error "+s.getMessage());
        }
        try
        {
            con.close();
        }catch(SQLException s)
        {
            System.out.println("Closing MySQL Connection Error "+s.getMessage());
        }

    }
}
