package amazon_test_java;

import org.testng.annotations.Test;

import amazon_main_java.AddWishListPage;
import amazon_main_java.HomePage;
import amazon_main_java.ItemSearchedResult;
import amazon_main_java.LoginAmazonPage;
import amazon_main_java.ProductDetail_Page;

public class Add_WishList_TestCase4 extends Amazon_LaunQuit{
	
	@Test
	public void add_to_wishList() throws InterruptedException {
		
		HomePage hm= new HomePage(driver);
		hm.acList(driver);
		hm.signClick();
		
		LoginAmazonPage login= new LoginAmazonPage(driver);
		login.un();
		login.continueButton();
		login.pwd();
		login.signInButton();
		hm.searchItems();
		
		ItemSearchedResult itemsearched=new ItemSearchedResult(driver);
		itemsearched.selectClickProduct(driver);
		
		ProductDetail_Page pdp= new ProductDetail_Page(driver);
		pdp.WishList_Clicked_Test();
		
		  AddWishListPage wishlist=new AddWishListPage(driver);
		  wishlist.going_to_add_to_cart_fromThe_WishList(driver);
		 
		
	}
	

}
