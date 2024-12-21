package packagemaven.Project_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_HomePage {
	
	
	@FindBy(xpath="(//div[@aria-label='Your profile'])[1]")
	WebElement profileLogo;

	@FindBy(xpath ="//span[text()='Log Out']")
	WebElement logoutclick;
	
	public void profileLogoClick() {

		profileLogo.click();

	}

	public void logoutlinkClick() {

		logoutclick.click();

	}
	
	public FaceBook_HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
