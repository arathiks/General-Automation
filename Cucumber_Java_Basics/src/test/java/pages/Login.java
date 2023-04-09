package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login {
	
	WebDriver driver;
	Actions action;
	By txt_username = By.id("name");
	By txt_password = By.id("password");
	
	public Login(WebDriver driver){
		this.driver = driver;
	}
	public void login_to_application(String Username,String Password) {
		action = new Actions(driver);
		WebElement btn_login = driver.findElement(By.id("login"));
		driver.findElement(txt_username).sendKeys(Username);
		driver.findElement(txt_password).sendKeys(Password);
		action.scrollToElement(btn_login).perform();
		btn_login.click();
	}
	
}
