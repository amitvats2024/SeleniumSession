package seleniumsessions2024;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	private WebDriver driver;
	
	private JavascriptExecutor js;
	public JavaScriptUtil(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor)driver;
	}
	
	public String getTitle() {
	return js.executeScript("return document.title;").toString();
	}
	
	public String getURL() {
	return js.executeScript("return document.URL;").toString();
	}
	
	public void generateJsAlert(String mesg) {
	js.executeScript("alert('"+mesg+"')");
	}
	
	public String getPageInnerText() {
	return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	public void goBackWithJS() {
		js.executeScript("history.go(-1);");
	}
	
	public void goForwardWithJS() {
		js.executeScript("history.go(1);");
	}

	public void pagerefreshWithJS() {
		js.executeScript("history.go(0);");
	}
	
	public void zoomChromeEdgeSafariFirefox (String zoomPercentage) {
	js.executeScript("document.body.style.zoom = '"+zoomPercentage+"%';");
	}
	
	public void scrollMiddlePageDown() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight/2);");
	}
	
	public void scrollPageDown() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	
	public void scrollPageUp() {
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	}
	
	public void scrollPageDown(String height) {
		js.executeScript("0, '"+height+"');");
	}
	
	public void scrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void drawBorder(WebElement element) {
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundColor");//white
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(0,200,0)", element);// Green
			changeColor(bgcolor, element);// White
		}
	}

	private void changeColor(String color, WebElement element) {
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);//G-->W--G--W---G--W
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}
}