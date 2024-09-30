package seleniumsessions2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		int imagescount =  getElementCounts(images);
		System.out.println(imagescount);
		List<String> eleListText = getElementsTextList(links);
		
		 System.out.println(eleListText.contains("About Us"));
		 System.out.println(eleListText.contains("Contact Us"));
		 
		 printElementList(links);
		
	}
	
	public static void printElementList(By locator) {
		List<String> eleTextList = getElementsTextList(locator);
		for (String e: eleTextList) {
			System.out.println(e);
		}
	}
	
	public static List<String> getElementsTextList(By locator) {
		
		List<WebElement> eleList = getElementsBy(locator);
		List<String> eleListText = new ArrayList<String>();
		for (WebElement e: eleList) {
				String eleText = e.getText();
				if (eleText.length()!=0) {
					eleListText.add(eleText);
			}
			
		}
		return eleListText;
		
	}
	
	public static int getElementCounts(By locator) {
		return getElementsBy(locator).size();
	}
	public static List<WebElement> getElementsBy(By locator) {
		return driver.findElements(locator);
	}
}
