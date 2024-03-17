package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ClassForRemovingRepeat {
 static WebDriver driver;
public static void precondition() {
    driver = new ChromeDriver();
	driver.manage().window().maximize();
}

public static void precondition1() {
	driver = new EdgeDriver();
	driver.manage().window().maximize();

}

public static void precondition2() {
	driver = new SafariDriver();
	driver.manage().window().maximize();
}

public static void precondition3() {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
}

public static void postcondition1() {
	driver.close();
}
public static void postcondition2() {
	driver.quit();
}
}