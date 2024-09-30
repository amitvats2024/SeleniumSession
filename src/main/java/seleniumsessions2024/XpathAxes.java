package seleniumsessions2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type = 'checkbox']")).click();
		//xpathutil("Garry.White");
		//xpathutil("John.Smith");
		
//		driver.findElement(By.xpath("//a[text()='Joe.Root']/ancestor::tr//input[@type = 'checkbox']")).click();
//		List<WebElement> userdetails = driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
//		
//		for (WebElement e : userdetails) {
//			String text = e.getText();
//			System.out.println(text);
//	}
			
		System.out.println(getUserDetails("Joe.Root"));
		
	}
	
	public static List<String> getUserDetails(String username) {
		List<WebElement> userdetails = driver.findElements(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td"));
		List<String>  userdetailslist= new ArrayList<String>(); 
		for (WebElement e : userdetails) {
			String text = e.getText();
			userdetailslist.add(text);
		}
		return userdetailslist;
	}
	
	public static void xpathutil(String name) {
		driver.findElement(By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@type = 'checkbox']")).click() ;
	}

}
