package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_PF {
	
	@FindBy (id = "logout")
	WebElement btn_logout;
	
	WebDriver driver;
	Actions action;
	
	public Logout_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void home_page_displayed() {
		action = new Actions(driver);
		action.scrollToElement(btn_logout).perform();
		btn_logout.isDisplayed();
		
	}

}
