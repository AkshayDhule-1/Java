//Select query in JDBC
import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
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
		java.sql.Statement statement = conn.createStatement();
		System.out.println("Statement is created :"+statement);
		
		
		//4. Execute the query
		ResultSet result = statement.executeQuery("SELECT * FROM mydept120;");

		
		while(result.next()) {
			System.out.println("DEPTNO :"+result.getInt(1));
			System.out.println("DNAME :"+result.getString(2));
			System.out.println("LOC :"+result.getString(3));
			System.out.println("--------------------------------.");
		}
		
		result.close();
		statement.close();
		conn.close();
		System.out.println("Disconnected from Database.");
	}
}


