package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomepage {

	public DWSHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 @FindBy(id = "small-searchterms")
 WebElement search_box;
 @FindBy(xpath = "//input[@class='button-1 search-box-button']")
 WebElement submit_cta;
}
