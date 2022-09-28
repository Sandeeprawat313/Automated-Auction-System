package utility;

import java.sql.Connection;

public class Demo {

	public static void main(String[] args) {
		Connection conn = DButil.provideConnection();
		System.out.println(conn);
		// com.mysql.cj.jdbc.ConnectionImpl@7c137fd5 so it is working

	}

}
