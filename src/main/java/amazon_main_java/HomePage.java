package amazon_main_java;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//span[text()='Account & Lists']")
	WebElement accountList;

	@FindBy(xpath= "(//span[text()='Sign in'])[1]")
	WebElement signin;
	
	@FindBy(css="#twotabsearchtextbox")
	WebElement search_Item;

	public void acList(WebDriver driver) {

		if(accountList.isDisplayed()==true && accountList.isEnabled()==true) {
			
			Actions a1 = new Actions(driver);
			a1.moveToElement(accountList).perform();

	     	}
		
		else {
			
			System.out.println("The Account and List hoverover option is disabled");
		}
	}

	public void signClick() {

		if(signin.isDisplayed()==true && signin.isEnabled()==true) {
			
			signin.click();
		}
		
		else {
			
			System.out.println("The Sign In button is disabled so can't go to the login page");
		}
	}
	
	public void searchItems() {
		
		if(search_Item.isDisplayed() ==true && search_Item.isEnabled()==true) {
		
		search_Item.sendKeys("shoes" + Keys.ENTER);
	    }
		
		else {
			
			System.out.println("The Search field is disabled");
		}
	}
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
