package packagemaven.Project_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Main {

	
	// Step1: Locate the WebElement for each component by using @FindBy annotation.
	@FindBy(id = "email")
	WebElement username;

	@FindBy(name = "pass")
	WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	WebElement loginButton;

	// Step2: Create a method for each component where we can pass the sendkeys.

	public void un(String userId) {

		username.sendKeys(userId);
	}

	public void pwd(String fbpwd) {

		password.sendKeys(fbpwd);
	}

	public void loginBtn() {

		loginButton.click();
	}
	
	//Step3: Initialize the element with class PageFactory.
	
	public LoginPage_Main(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
