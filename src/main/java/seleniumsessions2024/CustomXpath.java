package seleniumsessions2024;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	
	public static void main(String[] args) {
		//xpath: XML Path: HTML XML Path: address of the element in the DOM
		
		//DOM: HTML+XML
		
		//1, absolute xpath : /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
		//2. relative xpath: relative attributes of the element: id, class, name, type, text
			
		//1
		//htmltag[@attr = 'value']
		//input[@id='input-email']

		//2 
		//htmltag[@attr1 = 'value' and @attr2 = 'value']
		
		//3
		//text()
		
		//htmltag[text()='value']
		
		//a = How many links are available
		//img = How many images are available
		//h1 - all headers
		//input
		
		//a[@href]
		//a[not(@href)]
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		By footer = By.xpath(footerxpathutil("Make Money with Us"));
		List<WebElement> eleList = driver.findElements(footer);
		List<String> eleListText = new ArrayList<String>();
		System.out.println("Total footer links: "+eleList.size());
		for (WebElement e: eleList) {
				String eleText = e.getText();
				if (eleText.length()!=0) {
					eleListText.add(eleText);
			}
		}
		System.out.println(eleListText);
		
	}
		public static String footerxpathutil(String xpath) {
			String locator = "//div[text()='"+xpath+"']/following-sibling::ul//a";
			return locator;
		}
		
		

}
