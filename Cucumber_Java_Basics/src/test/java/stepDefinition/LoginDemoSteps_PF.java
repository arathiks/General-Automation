package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Login_PF;
import pageFactory.Logout_PF;

public class LoginDemoSteps_PF {

	WebDriver driver= null; 
	Login_PF login_pf;
	Logout_PF logout_pf;

	@Given("Load Browser and Navigate to Test Application")
	public void load_browser_and_navigate_to_test_application() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://example.testproject.io/web/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	@When("^Enter (.*) and (.*) and Click on login$")
	public void enter_username_and_password_and_click_on_login(String username,String password) throws InterruptedException {
		login_pf = new Login_PF(driver);
		login_pf.user_login_to_application(username, password);
	}

	@Then("User should redirect to Home Page")
	public void user_should_redirect_to_home_page() throws InterruptedException {

		logout_pf = new Logout_PF(driver);
		logout_pf.home_page_displayed();
		driver.close();
	}
}
