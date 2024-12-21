package amazon_main_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddWishListPage {

	@FindBy(linkText = "View Your List")
	WebElement click_on_view_your_wishList;

	public void going_to_add_to_cart_fromThe_WishList(WebDriver driver) {

		if (click_on_view_your_wishList.isDisplayed() == true && click_on_view_your_wishList.isEnabled()==true) {
			
			click_on_view_your_wishList.click();
			
		}

		else {

			System.out.println("The Added product is different please check the product name");
		}
	}

	public AddWishListPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
