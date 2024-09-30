package seleniumsessions2024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutorConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//JavascriptExecutor
		//Java ---> JS Code ---> JavaScriptExecutor(I) ---> executeScript()
		
		driver  = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		String title = js.executeScript("return document.title;").toString();
//		
//		System.out.println(title);
//		
//		String url = js.executeScript("return document.URL;").toString();
//		
//		System.out.println(url);

		WebElement ele = driver.findElement(By.xpath("(//a[text()='Order History'])[last()]"));
		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
		String title = jsutil.getTitle();
		System.out.println(title);
		
		String URL = jsutil.getURL();
		System.out.println(URL);
		
		//jsutil.generateJsAlert("Hello Amit!");
		
//		String pageText = jsutil.getPageInnerText();
//		System.out.println(pageText);
		
//		jsutil.pagerefreshWithJS();
//		jsutil.goBackWithJS();
//		jsutil.goForwardWithJS();
//		jsutil.zoomChromeEdgeSafariFirefox("200");
		//jsutil.scrollPageDown();
		jsutil.scrollIntoView(ele);
		jsutil.drawBorder(ele);
		
	}
	
	public static String getTitle() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	String title = js.executeScript("return document.title;").toString();
	return title;
	}
	
	public static String getURL() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String url = js.executeScript("return document.URL;").toString();
		return url;
		}
	
	public static void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundColor");//white
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(0,200,0)", element);// Green
			changeColor(bgcolor, element);// White
		}
	}
}
