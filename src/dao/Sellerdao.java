package dao;

import bean.Itemlist;
import bean.Seller;

public interface Sellerdao {

	public String registerSeller(Seller s1 );
	
	public String listItems(Itemlist i1);
	
	public String updatelistItems(Itemlist i1,String item_name,int seller_id);
	
	public String addItem(Itemlist i1);
	
	public String removeItem(String item_name, int seller_id);
}
