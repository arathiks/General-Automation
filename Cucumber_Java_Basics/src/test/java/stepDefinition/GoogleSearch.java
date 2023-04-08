package stepDefinition;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

	WebDriver driver = null;

	@Given("Brwoser is open and Google URL is loaded")
	public void brwoser_is_open_and_google_url_is_loaded() {

		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.navigate().to("https://www.google.com/");
	}

	@When("Serach by Text")
	public void serach_by_text() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("Page should be loaded")
	public void page_should_be_loaded() throws InterruptedException {
		driver.getPageSource().contains("Online Course");
		Thread.sleep(2000);
		driver.close();
	}

}
