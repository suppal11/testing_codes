package stepdefinations;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepdef2 
{

	@Given("user is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("ib");
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable Table) {
		List<List<String>> obj=Table.asLists(String.class);
		Iterator<List<String>> it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	@When("user enters following details on columns")
	public void user_enters_following_details_on_columns(DataTable dataTable) {
		List<Map<String,String>> ls=dataTable.asMaps(String.class,String.class);
		System.out.println(ls.get(0).get("firstname"));


	}
}
