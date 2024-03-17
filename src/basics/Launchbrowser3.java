package basics;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class Launchbrowser3 {

		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.lenskart.com/");
			driver.close();
			
		}

	}