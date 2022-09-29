package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Itemlist;
import bean.Seller;
import utility.DButil;

public class Sellerdaoimpl implements Sellerdao {

	@Override
	public String registerSeller(Seller s1) {

		String message = "NOT INSERTED..";

		try (Connection conn = DButil.provideConnection()) {
			// prepared statement
			PreparedStatement ps = conn.prepareStatement("insert into seller(name,email,password) values(?,?,?)");

			ps.setString(1, s1.getName());
			ps.setString(2, s1.getEmail());
			ps.setInt(3, s1.getPassword());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Seller registered successfull";

		} catch (SQLException e) {
			e.getMessage();
		}

		return message;

	}

	@Override
	public String listItems(Itemlist i1) {
		String message = "NOT INSERTED..";
//		logic
		try (Connection conn = DButil.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into items(item_name,price,qty,total_price) values(?,?,?,?);");
			ps.setString(1, i1.getItem_name());
			ps.setInt(2, i1.getPrice());
			ps.setInt(3, i1.getQty());
			ps.setInt(4, i1.getTotal_price());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Item successfully listed";

		} catch (SQLException e) {
			e.getMessage();

		}

		return message;
	}

	@Override
	public String updatelistItems(Itemlist i1,int serialNo) {
		String message = "NOT UPDATED..";
//		logic
		try (Connection conn = DButil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("update items Set item_name = ?,price = ?, qty = 5, total_price = ?  Where serialNo = ?");
			ps.setString(1, i1.getItem_name());
			ps.setInt(2, i1.getPrice());
			ps.setInt(3, i1.getQty());
			ps.setInt(4, i1.getTotal_price());
			ps.setInt(5, serialNo);

			int x = ps.executeUpdate();// Check this

			if (x > 0)
				message = "Item updated successfully";

		} catch (SQLException e) {
			e.getMessage();

		}

		return message;

	}

}
