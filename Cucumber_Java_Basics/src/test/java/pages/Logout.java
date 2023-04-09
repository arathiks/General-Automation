package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout {
	WebDriver driver;
	Actions action;
	By btn_logout = By.id("logout");
	
	
	public Logout(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verify_logout_displays() throws InterruptedException {
		action = new Actions(driver);
		WebElement btn_logout_element = driver.findElement(By.id("logout"));
		btn_logout_element.isDisplayed();
		action.scrollToElement(btn_logout_element).perform();
		Thread.sleep(1000);
	}
}
