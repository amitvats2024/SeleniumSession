package seleniumsessions2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		String Title = PageTitleContains(5, "Free CRM software");
		System.out.println(Title);
		
		//driver.getTitle(); //loading.....checking.... null
		
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		boolean flag = false;
//		try {
//			flag = wait
//					.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales, and support."));
//			flag = true;
//		}
//		catch (TimeoutException e) {
//			System.out.println("title is not matched");
//		}
//		
//		if (flag) {
//			System.out.println("Title is correct");
//		}
//		
//		else {
//			System.out.println("Title is incorrect");
//		}
	}
	
	public static String PageTitleIs(int timeout, String expectedTitle) {
		if(waitForTitleIs(timeout, expectedTitle)) {
			return driver.getTitle();
		}
		else {
			return "-1"; 
		}
	}
		
	
	public static boolean waitForTitleIs(int timeout, String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		boolean flag = false;
		try {
		return wait.until(ExpectedConditions.titleIs(expectedTitle));
		}
		catch (TimeoutException e){
		System.out.println("Title is incorrect");
		return flag;
		}
	}
	
	public static String PageTitleContains(int timeout, String expectedTitle) {
		if(waitForTitleContains(timeout, expectedTitle)) {
			return driver.getTitle();
		}
		else {
			return "-1"; 
		}
	}
	
	public static boolean waitForTitleContains(int timeout, String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		boolean flag = false;
		try {
		return wait.until(ExpectedConditions.titleContains(expectedTitle));
		}
		catch (TimeoutException e){
		System.out.println("Title is incorrect");
		return flag;
		}
	}
	
	public static String PageURLContains(int timeout, String expectedTitle) {
		if(waitForURLContains(timeout, expectedTitle)) {
			return driver.getTitle();
		}
		else {
			return "-1"; 
		}
	}
		
	
	public static boolean waitForURLContains(int timeout, String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		boolean flag = false;
		try {
		return wait.until(ExpectedConditions.urlContains(expectedTitle));
		}
		catch (TimeoutException e){
		System.out.println("Title is incorrect");
		return flag;
		}
	}
}	


