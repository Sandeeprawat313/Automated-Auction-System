package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {

	public static Connection provideConnection() {
		Connection conn = null;

		// load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// take the connection
		String url = "jdbc:mysql://localhost:3306/web19sb101db";
		try {
			conn = DriverManager.getConnection(url, "root", "8860578502");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;// check it create a Demo class and get the connection

	}

}
