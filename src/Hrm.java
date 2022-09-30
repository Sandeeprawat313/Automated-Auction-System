import java.util.Scanner;

import usecaseAdmin.buyerList;

public class Hrm {

	public static void selectOption() {
		System.out.println("\nPlease select an option to continue:-");
		System.out.println(
				"\n1. Login as admin\n2. Login as seller\n3. Login as buyer");
		// hardcore some of the login details
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println(
					"\n1. View the registered buyer list.\n"
					+ "2. View the registered Seller list.\n"
					+ "3. View the daily dispute report.\n"
					+ "4. View the daily selling report\n."
					+ "5. Solve the dispute report.");
			
			int subchoice = sc.nextInt();
			switch(subchoice) {
			case 1:
				buyerList b1 = new buyerList();
				b1.main(null);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
