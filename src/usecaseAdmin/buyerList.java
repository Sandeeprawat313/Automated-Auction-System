package usecaseAdmin;

import java.util.List;

import dao.Admindaoimpl;

public class buyerList {

	public static void main(String[] args) {
		// this will work like a button wher we can get the list of all the buyers on
		// one click
		Admindaoimpl a1 = new Admindaoimpl();
		List list = a1.buyerList();// call the method and it will return an object

		if (list.size() != 0) {
			// itrate the list
			list.forEach(i -> System.out.println(i));

		} else {

			System.out.println("No buyer exists");
		}

	}

}
