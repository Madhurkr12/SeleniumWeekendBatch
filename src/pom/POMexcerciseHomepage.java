package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMexcerciseHomepage {

		public POMexcerciseHomepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	 @FindBy(partialLinkText = "Books")
	 WebElement books;
	 @FindBy(partialLinkText = "Computers")
	 WebElement computer;
	 @FindBy(partialLinkText = "Electronics")
	 WebElement electronics;
	 @FindBy(partialLinkText = "Apparel & Shoes")
	 WebElement Apparel_Shoes;
	 @FindBy(partialLinkText = "Digital downloads")
	 WebElement Digital_downloads;
	 @FindBy(partialLinkText = "Jewelry")
	 WebElement Jewelry;
	 @FindBy(partialLinkText = "Gift Cards")
	 WebElement Gift_Cards;
	
	 
}
