package seleniumsessions2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(5000);
		
		String svgXpath = "//*[local-name() = 'svg' and @id = 'map-svg']//*[name() = 'g' and @id = 'regions']//*[name()='g' and @class= 'region']";
		
		

	}

}
