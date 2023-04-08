package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("User enters the login page")
	public void user_enters_the_login_page() {
		System.out.println("User enters the login page");
	}

	@When("Enter Username and Password")
	public void enter_username_and_password() {
	   System.out.println("Enter username and password");
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		System.out.println("Click on Login Button");
	}

	@Then("User redirects to Home Page")
	public void user_redirects_to_home_page() {
	  System.out.println("User redirects to Home Page");
	}

}
