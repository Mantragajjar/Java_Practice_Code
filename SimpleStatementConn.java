import java.sql.*;

public class SimpleStatementConn 
{
    public static void main(String[] args)
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","");
            Statement stmt = con.createStatement();

            // insert Query
            String insertQuery = "INSERT INTO table1 (name,city,age)VALUES('xyz','ahmd','18')";
            stmt.executeUpdate(insertQuery);

            // Update Query
            String updateQuery = "UPDATE table1 SET id=1 WHERE id=1";
            stmt.executeUpdate(updateQuery);
            
            // Delete Query
            String deleteQuery = "DLETE FROM table1 WHERE id=1";
            stmt.executeUpdate(deleteQuery);

            //Select Query
            String selectQuery = "SELECT * FROM table1";
            ResultSet rs = stmt.executeQuery(selectQuery);
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                con.close();
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
