package seleniumsessions2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextFields {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> textfields = driver.findElements(By.className("form-control"));
		
		System.out.println(textfields.size());
		
		for (WebElement e : textfields) {
			String textplaceholder = e.getAttribute("placeholder");
			System.out.println(textplaceholder);
		}
		
		driver.quit();
	}

}
