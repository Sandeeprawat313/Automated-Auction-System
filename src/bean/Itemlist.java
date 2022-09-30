package bean;

public class Itemlist {

	private String item_name;
	private String category;
	private int price;
	private int qty;
	private int total_price;
	

	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public int getTotal_price() {
		return total_price;
	}


	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}


	@Override
	public String toString() {
		return "Itemlist [item_name=" + item_name + ", category=" + category + ", price=" + price + ", qty=" + qty
				+ ", total_price=" + total_price + "]";
	}


	public Itemlist(String item_name, String category, int price, int qty, int total_price) {
		super();
		this.item_name = item_name;
		this.category = category;
		this.price = price;
		this.qty = qty;
		this.total_price = total_price;
	}


	public Itemlist() {
		super();
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
