package usecaseSeller;

import java.util.Scanner;

import bean.Seller;
import dao.Sellerdao;
import dao.Sellerdaoimpl;


public class registerSeller {

	public static void main(String[] args) {
		// take details from buyer
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of seller");
		String name = sc.next();
		System.out.println("Enter the email id");
		String email = sc.next();
		System.out.println("Enter the password");
		int password = sc.nextInt();
		
		
		Sellerdao si = new Sellerdaoimpl();
		
		
		Seller s1 = new Seller();
		s1.setName(name);
		s1.setEmail(email);
		s1.setPassword(password);
		String result = si.registerSeller(s1);
		System.out.println(result);
		

	}

}
