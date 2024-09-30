package seleniumsessions2024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create a WebElement +perform action (click, sendkeys gettext, isdisplayed)
		
//		//1. 
//		driver.findElement(By.id("input-email")).sendKeys("avats@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Test@123");
//		driver.findElement(By.className("btn btn-primary")).click();
		
		//2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		emailId.sendKeys("avats@gmail.com");
//		password.sendKeys("Test@123");
		
		//3. By Locator
//		
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailID = driver.findElement(email);
//		WebElement pswrd = driver.findElement(password);
//		
//		emailID.sendKeys("avats@gmail.com");
//		pswrd.sendKeys("Test@123");
		
//		//4. By locator + generic method for WebElement
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(email).sendKeys("avats@gmail.com");
//		getElement (password).sendKeys("Test@123");
		
		//5. By locator + generic method for WebElement and action
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(email, "avats@gmail.com");
//		doSendKeys(password, "Test@123");
//		
		//6. By locator + generic method for WebElement and action in ElementUtil Class
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil elUtil = new ElementUtil (driver); 
		elUtil.doSendKeys(email, "avats@gmail.com");
		elUtil.doSendKeys(password, "Test@123");
	}

//	public static void doSendKeys (By locator, String value) {
//		 getElement(locator).sendKeys(value);
//	}
//	
//	public static WebElement getElement (By locator) {
//		return driver.findElement(locator);
//	}
}
