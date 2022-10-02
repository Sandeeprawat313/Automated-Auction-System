package usecaseSeller;

import java.util.Scanner;

import dao.Sellerdao;
import dao.Sellerdaoimpl;

public class RemoveItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of item you want to remove");
		String item_name = sc.next();
		System.out.println("Enter the id of seller");
		int seller_id = sc.nextInt();
		
		Sellerdao s1 = new Sellerdaoimpl();
		String result = s1.removeItem(item_name,seller_id);
		System.out.println(result);

	}

}
