package implementation;


public class Search 
{
	public void displayProduct(Product pro) 
	{
		if (pro.getproductlist().contains(pro.getProductname()))
		{
			System.out.println(pro.getProductname()); 
		}
		else
		{
			System.out.print("It does not works");
		}
			
	}

}
