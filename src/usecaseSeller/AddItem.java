package usecaseSeller;

import java.util.Scanner;

import bean.Itemlist;
import dao.Sellerdao;
import dao.Sellerdaoimpl;

public class AddItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of item");
		String item_name = sc.next();
		
		System.out.println("Enter the price of item");
		int price = sc.nextInt();
		
		System.out.println("Enter the quantity");
		int qty = sc.nextInt();
		
		Itemlist i1 = new Itemlist(item_name, price, qty, price*qty);
		Sellerdao s1 = new Sellerdaoimpl();
		String message = s1.addItem(i1);
		
		// print message
		System.out.println(message);

	}

}
