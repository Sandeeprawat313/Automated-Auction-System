package usecaseAdmin;

import java.util.Iterator;
import java.util.List;

import bean.Seller;
import dao.Admindaoimpl;

public class sellerList {

	public static void main(String[] args) {
		// this will work like a button wher we can get the list of all the sellers on
		// one click
		Admindaoimpl a1 = new Admindaoimpl();
		List list = a1.sellerList();// call the method and it will return an object

		if (list.size() != 0) {

			Iterator<Seller> itr = list.iterator();// creation of iterator

			while (itr.hasNext()) {
				Seller b1 = itr.next();
				System.out.println(b1);
			}

		} else {
			System.out.println("No seller exists");
		}

	}

}
