package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^Application is up and running$")
	public void application_is_up_and_running() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Application is fully up and running");
	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Enter username and password");
	}

	@Then("^Home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Home Page is displayed successfully");
	}

	/************************Feature 2************************************/
	
	@And("^User is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Login Successful");
	}

	@When("^User clicks on compose option$")
	public void user_clicks_on_compose_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clicked on Compose Button");
	}

	@And("^User enters (.*?) and (.*?)$")
	public void user_enters_techbodhi_gmail_com_and_Resume_for_job(String email,String subject) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(email+""+subject);
	}

	@And("^User Clicks on Send button$")
	public void user_Clicks_on_Send_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clicked on Send Button");
	}

	@Then("^Compose window is closed$")
	public void compose_window_is_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Compose window is closed");
	}

	@And("^Message window pops up\\.$")
	public void message_window_pops_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Message window pops up");
	}
	    
	

}
