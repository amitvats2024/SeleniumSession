package seleniumsessions2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	static WebDriver driver;
	public static void main(String[] args) {
		//Explicit Wait
			//WebDriver
			//FluentWait
		
		//Wait(I) until(); ---implements----> FluentWait(C) until(){}+individual methods(){} ---extends--> WebDriverWait(C) - no methods
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginbtn = By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		email_ele.sendKeys("avats@gmail.com");
//		
//		driver.findElement(password).sendKeys("Amit@123");
//		driver.findElement(loginbtn).click();
		
		//waitForElementPresence(email, 10).sendKeys("avats@gmail.com"); //10 : 2 -->2 10 : 12 : NSE timeout
		waitForElementVisible(email, 10).sendKeys("avats@gmail.com");
		getElement(password).sendKeys("Amit@123");
		getElement(loginbtn).click();
		
	}
	
	/*
	 * presenceOfElementLocated method definition
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 */
	
	public static WebElement waitForElementPresence (By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible on the page as well.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForElementVisible (By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
