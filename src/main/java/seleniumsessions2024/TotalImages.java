package seleniumsessions2024;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	
	//total images

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> imageslist = driver.findElements(By.tagName("img"));
		int imagescount = imageslist.size();
		
		System.out.println("total images:"+imagescount);
		
		int count = 0;
		for (WebElement e : imageslist) {
			String imagesrc = e.getAttribute("src");
			System.out.println("Images src is"+count+"="+imagesrc);
			count++;
		}
		
		//capture all the links
		//print the link text and href values
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int totallinks = linklist.size();
		System.out.println("Total links count:" + totallinks);
		for (WebElement e : linklist) {
			String linkhrefattribute = e.getAttribute("href");
			String linktext = e.getText();
			if (linktext.length() !=0) {
			System.out.println(linkhrefattribute+ " ======= " + linktext);
			}
		}
		//web scraping
		
		

	}

}
