package packagemaven.Project_Maven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestCase1_LoginFb extends ITestListners_Main {
	
	@Test
	public void LaunchFB() {
		
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		LoginPage_Main lfb= new LoginPage_Main(driver);
		lfb.un("shivamshavarn2113@gmail.com");
																																																																																																																																																																																																																																																																						lfb.pwd("Sundari@2102");
		lfb.loginBtn();
	}

}
