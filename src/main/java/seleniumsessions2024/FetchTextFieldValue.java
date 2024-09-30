package seleniumsessions2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue {
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		WebElement firstname = driver.findElement(By.id("input-firstname"));
//		
//		firstname.sendKeys("avats");
//		System.out.println(firstname.getAttribute("value"));
		
		By firstname = By.id("input-firstname");
		doSendKeys(firstname, "avats");
		System.out.println(doElementGetAttribute(firstname, "value"));
		System.out.println(doElementGetAttribute(firstname, "placeholder"));
		driver.quit();
		}
	
	public static String doElementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
	}
	
	//WE: FE
	//WEs: FEs
	//text: getText
	//attribute: getAttribute
	//Type: sendkeys
	//click: click
	//isDisplayed
	//isEnabled
	//isSelected
	
}