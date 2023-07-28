//JDBC INSERT
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertClass {
	public static void main(String[] args) throws SQLException {
		
		System.out.println("Trying to connect...");
		
		//1. Load the Driver
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver Loaded");
		
		//2.Aquire the connection
		System.out.println("Trying to connect..");
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
		System.out.println("Connected : "+conn);
		
		//3. make a desired statement (insert/update/delete/select)
		PreparedStatement pst = conn.prepareStatement("INSERT INTO MYDEPT120 VALUES (?,?,?)");
		
		pst.setInt(1, 40);
		pst.setString(2, "TESTING");
		pst.setString(3, "PUNE");
		
		System.out.println("Statement is created :"+pst);
		
		
		//4. Execute the query
		int rows = pst.executeUpdate();
		System.out.println("Rows Created..:"+rows);
		
		
		//close the statement 
		pst.close();
		conn.close();
		

		
		
		pst.close();
		conn.close();
		System.out.println("Disconnected from Database.");
	}
}


