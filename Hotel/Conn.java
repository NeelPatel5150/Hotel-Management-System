import java.sql.*;



public class Conn {

    Connection c;
    Statement s;
    Conn() throws SQLException, ClassNotFoundException
    {
        // step 1 load and resistor driver
        String drivername = "com.mysql.cj.jdbc.Driver";
        Class.forName(drivername);
        System.out.println("Driver Lodaded Succesfully.");

        // step 2 create connection
        String dburl = "jdbc:mysql://localhost:3306/hotelmanagementsystem";
        String dbuser = "root";
        String dbpass = "";
         c = DriverManager.getConnection(dburl, dbuser, dbpass);
         s = c.createStatement();

        if(c!=null)
        {
            System.out.println("Connection Succesfull.");
        }
        else{
            System.out.println("Not Connected.");
        }

        

    }
    
}
