package StepDefinations;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.Driverfactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPageSteps 
{
	private LoginPage loginpage=new LoginPage(Driverfactory.getDriver());
	private AccountsPage accountspage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) 
	{
		List<Map<String,String>> credlist=dataTable.asMaps();
		String username1=credlist.get(0).get("username");
		String password1=credlist.get(0).get("password");
		Driverfactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		accountspage=loginpage.DoLogin(username1, password1);
	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page()
	{
		String title=accountspage.getPagetitle();
		System.out.println("Title of the page is"+title);
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectionstable) 
	{
		List<String> expectedlist=sectionstable.asList();
		System.out.println("Expected List"+expectedlist);
		List<String> actuallist=accountspage.getSectionList();
		System.out.println("Actual List"+actuallist);
		Assert.assertTrue(expectedlist.containsAll(actuallist));
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedcount) 
	{
		Assert.assertTrue(accountspage.getSectioncount()==expectedcount);
	}


}
