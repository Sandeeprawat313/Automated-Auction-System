package usecaseAdmin;

import java.util.Iterator;
import java.util.List;

import bean.Buyer;
import dao.Admindaoimpl;

public class buyerList {

	public static void main(String[] args) {
		// this will work like a button wher we can get the list of all the buyers on
		// one click
		Admindaoimpl a1 = new Admindaoimpl();
		List list = a1.buyerList();// call the method and it will return an object

		if (list.size() != 0) {

			Iterator<Buyer> itr = list.iterator();// creation of iterator

			while (itr.hasNext()) {
				Buyer b1 = itr.next();
				System.out.println(b1);
			}

		} else {
			System.out.println("No buyer exists");
		}

	}

}
