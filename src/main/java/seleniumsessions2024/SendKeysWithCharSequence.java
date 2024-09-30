package seleniumsessions2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithCharSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String name = "AV";
		StringBuffer sb = new StringBuffer("Learning");
		StringBuilder sf = new StringBuilder("Selenium");
		
		driver.findElement(By.id("input-email")).sendKeys(name, " ", sb, " ", sf);
		System.out.println(driver.findElement(By.id("input-email")).getText());
		
	}

}
