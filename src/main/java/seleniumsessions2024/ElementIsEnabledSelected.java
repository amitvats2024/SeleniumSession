package seleniumsessions2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://seleniumpractise.blogspot.com/search?q=disable+textbox");
//		
//		boolean f1 = driver.findElement(By.id("fname")).isDisplayed();
//		System.out.println(f1);
//		
//		boolean f2 = driver.findElement(By.id("fname")).isEnabled();
//		System.out.println(f2);
//		
//		boolean f3 = driver.findElement(By.id("pass")).isDisplayed();
//		System.out.println(f3);
//		
//		boolean f4 = driver.findElement(By.id("pass")).isEnabled();
//		System.out.println(f4);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		boolean f1 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")).isSelected();
		System.out.println(f1);
		
		boolean f2 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).isSelected();
		System.out.println(f2);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
		
		Thread.sleep(1000);
		
		boolean f3 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).isSelected();
		
		//System.out.println(f1);
		//System.out.println(f3);
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).isSelected());
		
		
		
	}

}
