package seleniumsessions2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ElementDisplayed {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logo = By.className("img-responsive11");
		
		ElementUtil elUtil = new ElementUtil(driver);
		boolean flag = elUtil.isElementDisplayed(logo);
		System.out.println(flag);
		
	}

}
