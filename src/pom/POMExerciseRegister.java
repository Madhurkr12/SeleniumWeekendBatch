package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMExerciseRegister {
	public POMExerciseRegister(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
			}
		 @FindBy(xpath = "//input[@id='gender-male']")
		 WebElement gender;
		 @FindBy(id = "FirstName")
		 WebElement firstName;
		 @FindBy(id = "LastName")
		 WebElement lastName;
		 @FindBy(id = "Email")
		 WebElement email;	
		 @FindBy(id = "Password")
		 WebElement password;
		 @FindBy(id =  "ConfirmPassword")
		 WebElement confirmPassword;
		 @FindBy(id="register-button")
		 WebElement registerButton;
 
}
