package seleniumsessions2024;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert.getText());
		alert.accept();
	}
	
	public static Alert waitForAlertAndSwitch(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText (int timeout) {
		return waitForAlertAndSwitch(timeout).getText();
	}
	
	public static void acceptAlert(int timeout) {
		waitForAlertAndSwitch(timeout).accept();
	}

	public static void dismissAlert (int timeout) {
		waitForAlertAndSwitch(timeout).dismiss();
	}
	
	public static void enterValueOnAlert(int timeout, String value) {
		waitForAlertAndSwitch(timeout).sendKeys(value);
	}
}
