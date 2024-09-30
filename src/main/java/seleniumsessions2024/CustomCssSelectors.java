package seleniumsessions2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectors {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(3000);
		int loginelementscount = driver.findElements(By.cssSelector("input#username, input#password, button#loginBtn, input#remember")).size();
		
		System.out.println(loginelementscount);
		
		if (loginelementscount==4)
		{	
			System.out.println("PASS");
		

	}

}
}

