package mytests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 

public class TestNGFeatures {
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS - connectWithDB");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT - createUser");
	}
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC - openBrowser");
	}
	
	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM - logintoApp");
	}

	@Test
	public void searchTest() {
		System.out.println("Search test");
	}
	
	@Test
	public void cartTest() {
		System.out.println("Cart Test");
	}
	
	@Test
	public void paymentTest() {
		System.out.println("Payment Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM - logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - Close Browser");
	
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT - Delete User");
	}
	
	@AfterSuite
	public void disconnectwithDB() {
		System.out.println("AS - disconnect with DB");
	}
}
