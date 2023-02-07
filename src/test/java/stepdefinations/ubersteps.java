package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ubersteps 
{
	@Given("user wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String string) {
	   System.out.println("step -1");
	}

	@When("user selects car {string} and pick up point {string} and drop location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_location(String string, String string2, String string3) {
		System.out.println("step -2");
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("step -3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("step -4");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer int1) {
		System.out.println("step -5");
	}

}
