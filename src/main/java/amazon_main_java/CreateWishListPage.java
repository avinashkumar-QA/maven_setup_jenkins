package amazon_main_java;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateWishListPage {
	
	@FindBy(xpath = "(//span[@class='a-label a-radio-label'])//h5[text()='Shopping List']")
	WebElement select_wishList_type_options;

	@FindBy(css = "span#create_list")
	WebElement clickOn_Create_buttonFrom_AddWishList_PopUp;

	public void select_wishListType_Option_from_the_Add_WishList(WebDriver driver) throws InterruptedException {

		if (select_wishList_type_options.isDisplayed() == true && select_wishList_type_options.isEnabled() == true) {


			select_wishList_type_options.click();
			clickOn_Create_buttonFrom_AddWishList_PopUp.click();
		}

		else {

			System.out.println(
					"The ShoppingList WishList type is not selected or the it's  is in disabled mode please check");
		}

	}

	public CreateWishListPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
