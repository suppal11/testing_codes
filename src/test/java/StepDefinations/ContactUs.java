package StepDefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.ContactUsPage;
import com.qa.factory.Driverfactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ContactUs 
{

	private ContactUsPage contactus=new ContactUsPage(Driverfactory.getDriver());

	@Given("user navigates to contact us page")
	public void user_navigates_to_contact_us_page() 
	{
		Driverfactory.getDriver().get("http://automationpractice.com/index.php?controller=contact");
	}

	@When("user fills the form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException 
	{
		ExcelReader reader=new ExcelReader();
		List<Map<String, String>> testdata=reader.getData("C:\\Users\\ics\\Desktop\\Contactus.xlsx", sheetname);
		String heading=testdata.get(rownumber).get("Subjectheading");
		String email=testdata.get(rownumber).get("email");
		String order_ref=testdata.get(rownumber).get("orderref");
		String message=testdata.get(rownumber).get("message");
		contactus.fillContactUsForm(heading, email, order_ref, message);
	}

	@When("user clicks on send button")
	public void user_clicks_on_send_button() {
		contactus.clickSend();
	}

	@Then("it shows a successful message {string}")
	public void it_shows_a_successful_message(String expectedmessage) {
		String actual_msg=contactus.getSuccessMessg();
		Assert.assertEquals(expectedmessage, actual_msg);
	}

}
