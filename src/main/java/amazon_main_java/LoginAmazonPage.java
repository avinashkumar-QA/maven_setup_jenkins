package amazon_main_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAmazonPage {

	@FindBy(xpath = "//input[@name='email']")
	WebElement userNameSubmit;

	@FindBy(id = "continue")
	WebElement clickContinueButton;

	@FindBy(css = "#ap_password")
	WebElement passwordEnter;

	@FindBy(css = "#signInSubmit")
	WebElement pass_signIn;

	public void un(){

		userNameSubmit.sendKeys("avinashsingh2102@gmail.com");

	}

	public void continueButton(){
		
		clickContinueButton.click();
		
	}
	
	public void pwd() {

		passwordEnter.sendKeys("Sundari@2102");
		

	}
	
	public void signInButton() {
 
		pass_signIn.click();

	}
	
	public LoginAmazonPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

}
