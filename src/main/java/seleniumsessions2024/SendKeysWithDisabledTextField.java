package seleniumsessions2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithDisabledTextField {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=disable+textbox");
		
		//driver.findElement(By.id("pass")).sendKeys("Hello"); //element not interactable
		
		driver.findElement(By.id("pass")).click(); //no exception but it wont click

	}

}
