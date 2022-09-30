package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

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
		String message = "Item not found..";
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
				message = "Item successfully updates";

		} catch (SQLException e) {
			e.getMessage();

		}

		return message;
	}

	@Override
	public String updatelistItems(Itemlist i1, String item_name) {
		String message = "NOT UPDATED..";
//		logic
		try (Connection conn = DButil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"update items Set item_name = ? ,price = ?, qty = ?, total_price = ?  Where item_name =?");
			ps.setString(1, i1.getItem_name());
			ps.setInt(2, i1.getPrice());
			ps.setInt(3, i1.getQty());
			ps.setInt(4, i1.getTotal_price());
			ps.setString(5, item_name);

			int x = ps.executeUpdate();// Check this

			if (x > 0)
				message = "Item updated successfully";

		} catch (SQLException e) {
			e.getMessage();

		}

		return message;

	}

	@Override
	public String addItem(Itemlist i1) {
		String message = "NOT UPDATED..";
		// logic
		try (Connection conn = DButil.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into items(item_name,price,qty,total_price) values(?,?,?,?)");
			ps.setString(1, i1.getItem_name());
			ps.setInt(2, i1.getPrice());
			ps.setInt(3, i1.getQty());
			ps.setInt(4, i1.getTotal_price());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "item inserted successfully";

		} catch (SQLException e) {
			e.getMessage();
		}

		return message;
	}

	@Override
	public String removeItem(String item_name) {

		String message = "instruction failed";

		try (Connection conn = DButil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("delete from items where item_name = ?");
			ps.setString(1, item_name);
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message = "Item removed successfully";
					
		} catch (SQLException e) {
			e.getMessage();
		}

		//

		return message;
	}

}
