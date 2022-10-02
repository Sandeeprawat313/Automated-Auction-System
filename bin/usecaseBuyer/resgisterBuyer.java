package usecaseBuyer;

import java.util.Scanner;

import bean.Buyer;
import dao.buyerdao;
import dao.buyerdaoimpl;

public class resgisterBuyer {

	public static void main(String[] args) {
		// take details from buyer
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the email id");
		String email = sc.next();
		System.out.println("Enter the password");
		int password = sc.nextInt();
		
		// use buyerimpl class to send the data received above to database for registration
		//buyerdaoimpl bi = new buyerdaoimpl();// making obj to use the method
		buyerdao bi = new buyerdaoimpl();
		//String result = bi.registerBuyer(name, email, password);
		//System.out.println(result);
		
		
		Buyer b1 = new Buyer();
		b1.setName(name);
		b1.setEmail(email);
		b1.setPassword(password);
		String result = bi.registerBuyer2(b1);
		System.out.println(result);
		

	}

}
