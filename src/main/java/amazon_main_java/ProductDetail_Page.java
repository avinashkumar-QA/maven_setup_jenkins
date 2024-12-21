package amazon_main_java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetail_Page {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='submit.add-to-registry.wishlist']")
	WebElement addToWishlistButton;

	@FindBy(xpath = "//div[@id='atwl-popover-inner']")
	List<WebElement> preCreatedWishlist;

	@FindBy(xpath = "//input[@id='add-to-wishlist-button']")
	WebElement addWishListArrowDown;

	public void WishList_Clicked_Test() throws InterruptedException {
		try {


			// Wait to clicked on arrowDown wishList button//
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			if (addWishListArrowDown.isDisplayed() && addWishListArrowDown.isEnabled()) {
				wait.until(ExpectedConditions.visibilityOf(addWishListArrowDown));
				System.out.println("ArrowDown  Wishlist button is displayed and enabled.");
				addWishListArrowDown.click();
				System.out.println("ArrowDown button gets clicked");

				int length = preCreatedWishlist.size();
				System.out.println("The total length of list is  " + length);
				for (int i = 0; i < length; i++) {
					WebElement e1 = preCreatedWishlist.get(i);
					System.out.println(e1.getText());
				}
				preCreatedWishlist.get(length - 1).click();

			}

			else {

				System.out.println("No pre-created wishlist items found. Only clicking 'Add to Wishlist' button");
			}
		} catch (NoSuchElementException e1) {
			addToWishlistButton.click();
			System.out.println("Add to wishList only clicked");
		}
	}

	public ProductDetail_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
