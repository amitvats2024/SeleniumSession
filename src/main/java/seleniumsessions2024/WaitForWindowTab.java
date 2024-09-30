package seleniumsessions2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindowTab {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");// parent window
		
		WebElement executiveprofile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		Actions act = new Actions(driver);
		act.click(executiveprofile).build().perform();// child window
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean flag = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(flag);
	}
	

}
