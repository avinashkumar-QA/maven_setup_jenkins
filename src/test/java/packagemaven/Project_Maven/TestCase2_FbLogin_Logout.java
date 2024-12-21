package packagemaven.Project_Maven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListners_Main.class)
public class TestCase2_FbLogin_Logout extends ITestListners_Main {
	
	
	@Test
	public void LaunchFB() throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		LoginPage_Main lfb= new LoginPage_Main(driver);
		lfb.un("shivamshavarn2113@gmail.com");
																																																																																																																																																																																																																																																																															lfb.pwd("Sundari@2102");
		lfb.loginBtn();
		Thread.sleep(25000);
		FaceBook_HomePage fbhome=new FaceBook_HomePage(driver);
		fbhome.profileLogoClick();
		Thread.sleep(4000);
		fbhome.logoutlinkClick();
	}


}
