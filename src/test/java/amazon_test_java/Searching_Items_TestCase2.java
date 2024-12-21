package amazon_test_java;

import org.testng.annotations.Test;

import amazon_main_java.HomePage;
import amazon_main_java.LoginAmazonPage;

public class Searching_Items_TestCase2 extends Amazon_LaunQuit {
	
@Test	
public void loginAmazon_searchItems_()  {
		
		HomePage hm= new HomePage(driver);
		hm.acList(driver);
		hm.signClick();
		
		LoginAmazonPage login= new LoginAmazonPage(driver);
		login.un();
		login.continueButton();
		login.pwd();
		login.signInButton();
		hm.searchItems();
		
	}

}
