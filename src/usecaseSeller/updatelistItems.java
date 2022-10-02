package usecaseSeller;

import java.util.Scanner;

import bean.Itemlist;
import dao.Sellerdao;
import dao.Sellerdaoimpl;

public class updatelistItems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name no. of item you want to update");
		String item_name = sc.next();

		System.out.println("Enter the seller ID");
		int seller_id = sc.nextInt();

		System.out.println("update the name of Item");
		String name = sc.next();
		System.out.println("update the item category");
		String category = sc.next();

		System.out.println("update the price of item");
		int price = sc.nextInt();
		System.out.println("update the quantity");
		int qty = sc.nextInt();

		// make the objec and pass the data
		Itemlist l1 = new Itemlist();
		l1.setItem_name(name);
		l1.setCategory(category);
		l1.setPrice(price);
		l1.setQty(qty);
		l1.setTotal_price(price * qty);

		Sellerdao s1 = new Sellerdaoimpl();
		String result = s1.updatelistItems(l1, item_name, seller_id);
		System.out.println(result);

	}

}
