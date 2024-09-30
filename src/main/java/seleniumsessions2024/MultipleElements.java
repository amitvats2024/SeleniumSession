package seleniumsessions2024;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		// single Element - FE -----> WebElement
		// Multiple Element - FEs ---> List <WebElement>
		
		//total links
		//print the text for each link and ignore the blank text
		//find out broken links
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		int totallinks = linklist.size();
		System.out.println("Total Number of links: "+totallinks);
		
		//index:
		for (int i = 0; i < totallinks; i++) {
			String linktext = linklist.get(i).getText();
			//linktext.getAttribute(null)
			if (linktext.length()!=0){
			System.out.println(i+"="+linktext);
			}
		}
			System.out.println("---------------------------------------");
		//for each
			int count = 0;
		for(WebElement e : linklist) {
			String text = e.getText();
				if(text.length()!=0) {
					System.out.println(count + "=" +text);
				}
				count++;
			}
		}
	}
