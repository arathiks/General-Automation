package stepDefinition;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemo {
	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
	
	@Given("Load Browser and Navigate to Test Application")
	public void load_browser_and_navigate_to_test_application() {
	   System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe" );
	   //driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.navigate().to("https://example.testproject.io/web/");
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	  
	}

	@When("^Enter (.*) and (.*) and Click on login$")
	public void enter_username_and_password_and_click_on_login(String username,String password) throws InterruptedException {
		
	  driver.findElement(By.id("name")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  WebElement login = driver.findElement(By.id("login"));
	  action.scrollToElement(login).perform();
	  Thread.sleep(2000);
	  login.click();
	}

	@Then("User should redirect to Home Page")
	public void user_should_redirect_to_home_page() throws InterruptedException {
		WebElement logout = driver.findElement(By.id("logout"));
	   logout.isDisplayed();
	   action.scrollToElement(logout).perform();
	   Thread.sleep(1000);
	   driver.close();
	   driver.quit();
	}

}
