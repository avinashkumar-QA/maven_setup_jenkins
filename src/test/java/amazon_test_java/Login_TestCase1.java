package amazon_test_java;
import org.testng.annotations.Test;
import amazon_main_java.HomePage;
import amazon_main_java.LoginAmazonPage;

public class Login_TestCase1 extends Amazon_LaunQuit {

	@Test
	public void login_to_Amazon() {
		
		HomePage hm= new HomePage(driver);
		hm.acList(driver);
		hm.signClick();
		
		LoginAmazonPage login= new LoginAmazonPage(driver);
		login.un();
		login.continueButton();
		login.pwd();
		login.signInButton();
		
		
	}

}
