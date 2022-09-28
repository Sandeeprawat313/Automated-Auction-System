package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utility.DButil;

public class buyerimpl implements buyer {

	@Override
	public String registerBuyer(String name, String email, int password) {
		String message = "NOT INSERTED.."; // initial value because of return type
		// take the DB connection using pre-written logic

		try (Connection conn = DButil.provideConnection()) {
			// prepared statement
			PreparedStatement ps = conn.prepareStatement("insert into buyer(name,email,password) values(?,?,?)");

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setInt(3, password);

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Buyer registered successfull";

		} catch (SQLException e) {
			e.getMessage();
		}

		return message;
	}

}
