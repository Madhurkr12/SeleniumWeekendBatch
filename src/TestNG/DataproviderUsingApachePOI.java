package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderUsingApachePOI {
	@Test(dataProvider = "login")
	public void data(String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("[class='ico-login']")).click();
		driver.findElement(By.cssSelector("[name='Email']")).sendKeys(email);
		driver.findElement(By.cssSelector("[name='Password']")).sendKeys(password);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		driver.close();
	}
	@DataProvider(name = "login")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		File file = new File("C:\\Users\\Madhur\\OneDrive\\Documents\\SeleniumDataDriven.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int coloumn = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj = new Object[row][coloumn];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				obj[i][j]= sheet.getRow(i).getCell(j).toString();
			}
			
		}
		return obj;
		
		
				
	}

}
