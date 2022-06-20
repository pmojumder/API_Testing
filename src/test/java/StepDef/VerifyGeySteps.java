package StepDef;

import java.io.FileNotFoundException;

import ApiUtils.CreateAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyGeySteps {
	@Given("Calling Get Ethod")
	public void calling_get_ethod() {
	   
		CreateAPI ref=new CreateAPI();
		ref.getMethod();
	}

	@Then("Get executed Successfully")
	public void get_executed_successfully() {
System.out.println("Get executed Successfully");
	}
	@Given("Create new Booking id")
	public void create_new_booking_id() throws FileNotFoundException {
	   CreateAPI ref=new CreateAPI();
	   ref.createMethod();
	}

	@Then("Create executed successfully")
	public void create_executed_successfully() {
	    System.out.println("Create Executed successfully");
	}
}
