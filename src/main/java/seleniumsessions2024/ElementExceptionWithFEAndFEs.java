package seleniumsessions2024;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementExceptionWithFEAndFEs {
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logo = By.className("img-responsive11");
		
		//driver.findElement(logo).click();// NoSuchElementException
		
		List<WebElement> imageslist = driver.findElements(logo);
		System.out.println(imageslist.size());//0
	} 
	

}
