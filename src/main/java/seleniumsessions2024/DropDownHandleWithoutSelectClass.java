package seleniumsessions2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial/");
		By countrylocator = By.xpath("//select[@id= 'Form_getForm_Country']/option");
		
//		List <WebElement> country = driver.findElements(countrylocator);
//		String text;
//		
//		for (WebElement e : country) {
//			text = e.getText();
//			if (text.contains("India")) {
//				e.click();
//				break;
//			}
//		}
		
		SelectDropDownValue(countrylocator, "India");
	}
	
	public static void SelectDropDownValue(By locator, String value) {
		List <WebElement> country = driver.findElements(locator);
		String text;
		
		for (WebElement e : country) {
			text = e.getText();
			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}
}

