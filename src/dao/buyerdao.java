package dao;

import java.util.List;

import bean.Buyer;

public interface buyerdao {

	public String registerBuyer(String name,String email, int password);
	// no need to make static and no need of retun type
	// ye implement hoga
	public String registerBuyer2(Buyer buyer );// optimise way
	public List getitemsByCategory(String category);
	
}
