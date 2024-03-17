package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {

	@BeforeSuite                                                  //connect to database first execution would be here 
	public void beforeSuite() {
		System.out.println("before suite");
	}
	@BeforeTest														// data driven info to be collected
	public void beforeTest() {
		System.out.println("before test");
	}
	@BeforeClass													//preconditions
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@BeforeMethod													//methods like repeating methods eg:- login method
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@Test                                                           //test steps would be executed here
	public void test() {
		System.out.println("test");
	}
	@AfterMethod													//After steps this method would run like logout
	public void afterMethod() {
		System.out.println("Aftermethod");
	}
	@AfterClass														//After steps methods like close the browser
	public void afterClass() {
		System.out.println("afterclass");
	}
	@AfterTest														//after steps this method would disconnect data driven collected
	public void afterTest() {
		System.out.println("afterTest");
	}
	@AfterSuite														//after test this method would disconnect the DB.
	public void afterSuite() {
		System.out.println("Aftersuite");
	}
}
