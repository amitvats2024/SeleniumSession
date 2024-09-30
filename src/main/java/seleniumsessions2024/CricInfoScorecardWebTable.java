package seleniumsessions2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoScorecardWebTable {
	static WebDriver driver;
	
	public static void main(String[] args) {
	driver = new ChromeDriver();
	driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
	
	
	//String wkttakername = driver.findElement(By.xpath("//span[text()='Dawid Malan']/ancestor::td/following-sibling::td/span")).getText();
	
	System.out.println(getwickettakername("Dawid Malan"));
	System.out.println(getwickettakername("Sam Curran"));
	
	System.out.println(getPlayerScorecard("Dawid Malan"));
	
}
	
	
	public static List<String> getPlayerScorecard (String playername) {
		List<WebElement> scorelist = driver.findElements(By.xpath("//span[text()='"+playername+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> scorecardlist = new ArrayList<String>();
		for (WebElement e : scorelist) {
			String text = e.getText();
			scorecardlist.add(text);
		}
		return scorecardlist;
	}
	
	public static String getwickettakername(String name) {
		return driver.findElement(By.xpath("//span[text()='"+name+"']/ancestor::td/following-sibling::td/span")).getText() ;
	}
}
