package seleniumsessions2024;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //sel3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// sel 4.x
		
		//implicit wait is a global wait:
		// it will be applied on all the web elements by default.
		//it cannot be applied to specific webelement
		// it cannot be applied for the non web elements: title, url, windows, JS pop ups
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email11")).sendKeys("amit@gmail.com"); 
		//10 secs : 2 secs: 2 secs
		// 10 secs : 12 secs : NoSuchElement Exception - NSE
		// 10 secs : 5 secs : 5 secs
		
		driver.findElement(By.id("input-password")).sendKeys("Amit@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
	}

}
