package dao;

import bean.Itemlist;
import bean.Seller;

public interface Sellerdao {

	public String registerSeller(Seller s1 );
	
	public String listItems(Itemlist i1);
	
	public String updatelistItems(Itemlist i1,int serialNo);
}
