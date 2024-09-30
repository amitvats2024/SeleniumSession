package seleniumsessions2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessBrowserConcept {

	public static void main(String[] args) {
	
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		
//		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--headless");
//		co.addArguments("--Inprivate");
//		WebDriver driver = new EdgeDriver(eo);
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.quit();

	}

}
