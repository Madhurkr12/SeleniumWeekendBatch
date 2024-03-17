package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POmExerciseTitleBar {
		
	
		public POmExerciseTitleBar(WebDriver driver) {
			PageFactory.initElements(driver, this);
		
				}
			 @FindBy(partialLinkText = "Register")
			 WebElement register;
			 @FindBy(partialLinkText = "Log in")
			 WebElement Login;
			 @FindBy(partialLinkText = "Shopping cart")
			 WebElement ShoppingCart;
			 @FindBy(partialLinkText = "Wishlist")
			 WebElement wishlist;	

}
