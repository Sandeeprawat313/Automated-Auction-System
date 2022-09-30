package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

import bean.Buyer;
import bean.Seller;
import utility.DButil;

public class Admindaoimpl implements Admindao {

	@Override
	public List buyerList() {
		List<Buyer> list = new ArrayList<>();

		try (Connection conn = DButil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from buyer;");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				// int serialNo = rs.getInt("serialNo");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int password = rs.getInt("password");

				// uper se value a jayi use object banao and object me store karo
				list.add(new Buyer(name, email, password));

			}

		} catch (SQLException e) {
			e.getMessage();
		}

		return list;

	}

	@Override
	public List sellerList() {
		List<Seller> list = new ArrayList<>();

		try (Connection conn = DButil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from seller;");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				// int serialNo = rs.getInt("serialNo");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int password = rs.getInt("password");

				// uper se value a jayi use object banao and object me store karo
				list.add(new Seller(name, email, password));

			}

		} catch (SQLException e) {
			e.getMessage();
		}

		return list;

	}

}
