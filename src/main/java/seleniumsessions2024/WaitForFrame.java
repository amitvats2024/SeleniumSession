package seleniumsessions2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForFrame {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html"); //page
		
		By framelocator = By.name("main");
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.waitForFrameUsingLocatorAndSwitchToIt(framelocator, 10);
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
	}

}
