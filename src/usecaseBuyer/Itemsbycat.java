package usecaseBuyer;

import java.util.List;
import java.util.Scanner;

import dao.buyerdao;
import dao.buyerdaoimpl;

public class Itemsbycat {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category of your choice. mobile/furniture/home appliance/stationary");
		String category = sc.next();
		
		buyerdao b1 = new buyerdaoimpl();
		List list = b1.getitemsByCategory(category);
		list.forEach(i-> System.out.println(i));
	}
	

}
