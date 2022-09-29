package usecaseSeller;

import java.util.Scanner;

import bean.Itemlist;
import dao.Sellerdao;
import dao.Sellerdaoimpl;

public class ListProducts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of Item");
		String name = sc.next();
		System.out.println("Enter the price of item");
		int price = sc.nextInt();
		System.out.println("Enter the quantity");
		int qty = sc.nextInt();
		
		//make the objec and pass the data
		Itemlist l1 = new Itemlist(name, price, qty, price*qty);
		
		
		Sellerdao s1 = new Sellerdaoimpl();
		String result = s1.listItems(l1);// pass the object with data i.e set item
		System.out.println(result);
		
	}

}
