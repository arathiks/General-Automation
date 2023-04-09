package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PF {
	
	@FindBy(id = "name") 
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(id = "login")
	WebElement btn_login;
	
	Actions action;
	WebDriver driver;
	
	public Login_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void user_login_to_application(String userName, String password) {
		action = new Actions(driver);
		txt_username.sendKeys(userName);
		txt_password.sendKeys(password);
		action.scrollToElement(btn_login).perform();
		btn_login.click();
	}

}
