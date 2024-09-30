package seleniumsessions2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		driver.get("https://google.com");
		
		By searchfield = By.name("q");
		By sugglist = By.xpath("//div/ul/li//div[@class='wM6W7d']/span");
		
		//doSearch(searchfield, sugglist, "Selenium", "sulfide");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSearch(searchfield, sugglist, "Selenium", "Cypress");
		}
		 
	
	public static boolean doSearch(By searchfield, By sugglist, String searchkey, String searchmatchvalue) throws InterruptedException  {
		
		boolean flag = false;
		driver.findElement(searchfield).sendKeys(searchkey);
		Thread.sleep(3000);
		
		List<WebElement> suggEleList = driver.findElements(sugglist);
		
		int suggsize = suggEleList.size();
		
		System.out.println ("The size of suggestion List is:" + suggsize);
		
		for (WebElement e : suggEleList) {
			String text = e.getText();
			if (text.contains(searchmatchvalue)) {
				e.click();
				flag = true;
				break;
			}
	 
		}
		
		if (flag) {
			System.out.println(searchmatchvalue+ " 	is found");
			return true;
		}
		
		else {
			System.out.println(searchmatchvalue+ " is not found");
			return false;
		}
	}

}
