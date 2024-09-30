package seleniumsessions2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinksCountAndText {

		static WebDriver driver;
		public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			By footerlinks = By.xpath("(//div[@class = 'row'])[last()]");
			
			By footerlinkct = By.xpath("//div[@class= 'col-sm-3']//li");
			
			//List<WebElement> footerele = driver.findElements(footerlinks);
			
			List<WebElement> ftele = driver.findElements(footerlinkct);
			 
			int footerlinkscount = ftele.size();
			
			System.out.println("Total Number of Footer Links are: "+footerlinkscount);
			
//			for (WebElement e: ftele) {
//				String text = e.getText();
//				System.out.println(text);
				
				
			List<String> text1 = new ArrayList<String>();
			String text = null;
			for (WebElement e : ftele) {
				text = e.getText();
				if (text.length()!=0) {
				text1.add(text);
				}
			}
			System.out.println(text1);
	}

}
