package carProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	public static Connection createConnection()
	{
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/mydatabase";
			String user = "root";
			String pass = "Aryan@7856";
			conn = DriverManager.getConnection(url, user, pass);
//			System.out.println("success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
