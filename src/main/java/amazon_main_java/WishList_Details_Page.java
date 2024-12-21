package amazon_main_java;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishList_Details_Page {

	@FindBy(css = "span[id='pab-ASIN-B08HNGXTRQ-A21TJRUUN4KGV'] input[type='submit']")
	WebElement click_to_add_to_Cart_from_wishList_details_page;

	@FindBy(linkText = "View Cart")
	WebElement click_on_view_cart_from_theWishListDetailsPage;

	public void click_add_to_cart_from_wishlistDetails_page(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if (click_to_add_to_Cart_from_wishList_details_page.isDisplayed()
				&& click_to_add_to_Cart_from_wishList_details_page.isEnabled()) {
			wait.until(ExpectedConditions.visibilityOf(click_to_add_to_Cart_from_wishList_details_page));
			click_to_add_to_Cart_from_wishList_details_page.click();
		}

		else {

			System.out.println("The Add to cart button is not enabled or something mistake please check");
		}
	}

	public void click_on_the_view_cart_from_thewishList_Details_page() {

		click_on_view_cart_from_theWishListDetailsPage.click();

	}

	public WishList_Details_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
}
