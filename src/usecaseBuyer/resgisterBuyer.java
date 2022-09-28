package usecaseBuyer;

import java.util.Scanner;

import dao.buyerimpl;

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
		buyerimpl bi = new buyerimpl();// making obj to use the method
		String result = bi.registerBuyer(name, email, password);
		System.out.println(result);

	}

}
