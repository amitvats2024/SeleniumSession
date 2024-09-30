package seleniumsessions2024;

import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectDropDownHandling {
	
	static WebDriver driver;
	public static void main(String[] args) {
		//dropdown: htmltag: <select>
		//use Select class in Selenium
		
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial/");
		By countrylocator = By.xpath("//select[@id= 'Form_getForm_Country']");
		//By total = By.xpath("//select[@id= 'Form_getForm_Country']/option");
		
		//WebElement country = driver.findElement(countrylocator);
		
		//List<WebElement> countrylist = driver.findElements(total);
		
		//selectDropDownValueByIndex(countrylocator, 5);
		
		//selectDropDownValueByValue(countrylocator, "India");
		
		//selectDropDownValueByVisibleText(countrylocator, "Brazil");
		
//		Select selectdropdwn = new Select(country);
		
		
		int totalcount = getDropDownCount (countrylocator);
		System.out.println("The Total Number of Countries are: "+ (totalcount-1));
		List <String> option = getDropDownOptionsList(countrylocator);
		System.out.println(option);
		
		//single country validation
		if (getDropDownOptionsList(countrylocator).contains("India")) {
			System.out.println("Test is Passed");
		}
		
		// Multiple Countries Validation
		List<String> expectedcountrylist = Arrays.asList("India", "Brazil", "Australia");
		
		
		if (getDropDownOptionsList(countrylocator).containsAll(expectedcountrylist)) {
			System.out.println("Test is Passed");
		}
		
//		List<WebElement> optionlist = selectdropdwn.getOptions();
//		System.out.println("The Total Number of Countries are: "+optionlist.size());
		
		
//		int countrylistsize = countrylist.size();
//		
//		System.out.println("The Total Number of Countries are: " + countrylistsize);
//		
//		String text;
//		for (WebElement e : countrylist) {
//			text = e.getText();
//			System.out.println(text);
//		}
//		
//		selectdropdwn.selectByValue("India");
//		
//		selectdropdwn.selectByIndex(5);
//		
//		selectdropdwn.selectByVisibleText("Brazil");
		
		
		
		
		
	}
	
	public static List<String> getDropDownOptionsList (By locator) {
		Select select = new Select (getElement(locator));
		List <WebElement> optionlist = select.getOptions();
		
		List <String> options = new ArrayList<String>();
		for (WebElement e: optionlist) {
			String text = e.getText();
			options.add(text);
		}
		
		return options;
	}
	
	public static int getDropDownCount(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> countrylist = select.getOptions();
		return countrylist.size();
	}
	
	public static void selectDropDownValueByVisibleText(By locator, String visibletext) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibletext);
	}

	public static void selectDropDownValueByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void selectDropDownValueByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
