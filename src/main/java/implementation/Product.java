package implementation;

import java.util.ArrayList;
import java.util.List;

public class Product 
{
	String productname;
	int price;
	public Product(String productname,int price)
	{
		this.productname=productname;
		this.price=price;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<String> getproductlist()
	{
		List<String> productlist=new ArrayList<String>();
		productlist.add("Apple macbook");
		productlist.add("Apple Macbook");
		productlist.add("Apple Macbook");
		return productlist;
		
	}
}
