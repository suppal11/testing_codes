package stepdefinations;

import implementation.Product;
import implementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class stepdef1
{
	Product productname1;
    Search search;
	@Given("I have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page() 
	{
		System.out.println("1st line");
	}
//using old cuke regex
	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String productname, Integer price) 
	{
		//System.out.println("2st line"+productname+"price"+price);
		productname1=new Product(productname, price);
	}

	@Then("product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productname)
	{
		//System.out.println("3st line");
		search=new Search();
		search.displayProduct(productname1);
		Assert.assertEquals(productname1.getProductname(), productname);
	}

@Then("i want to test1")
public void i_want_to_test1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io0Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
