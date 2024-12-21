package amazon_test_java;

import org.testng.annotations.Test;

import amazon_main_java.CreateWishListPage;
import amazon_main_java.HomePage;
import amazon_main_java.ItemSearchedResult;
import amazon_main_java.LoginAmazonPage;
import amazon_main_java.ProductDetail_Page;

public class CreatingNewWishList_TestCase3 extends Amazon_LaunQuit {

	@Test
	public void searched_item_clicking() throws InterruptedException {

		HomePage hm = new HomePage(driver);
		hm.acList(driver);
		hm.signClick();

		LoginAmazonPage login = new LoginAmazonPage(driver);
		login.un();
		login.continueButton();
		login.pwd();
		login.signInButton();
		hm.searchItems();

		ItemSearchedResult itemsearched = new ItemSearchedResult(driver);
		itemsearched.selectClickProduct(driver);

		ProductDetail_Page pdp= new ProductDetail_Page(driver);
		pdp.WishList_Clicked_Test();

		CreateWishListPage cnw = new CreateWishListPage(driver);
    	cnw.select_wishListType_Option_from_the_Add_WishList(driver);

	}

}
