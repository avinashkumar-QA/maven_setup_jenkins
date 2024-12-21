package amazon_main_java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemSearchedResult {
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement select_and_clickonProduct;
	
	public void selectClickProduct(WebDriver driver) {
		
		select_and_clickonProduct.click();
		
		Set <String> parent_child_window_id= driver.getWindowHandles();
		System.out.println(parent_child_window_id);
		Iterator<String> iterate= parent_child_window_id.iterator();
		String parent_windowId=iterate.next();
		String child_windowId=iterate.next();
		System.out.println("Browser id of parent window -->" + parent_windowId);
		System.out.println("Browser id of child window ---> " + child_windowId);
		driver.switchTo().window(child_windowId);
	}
	
	public ItemSearchedResult(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

}
