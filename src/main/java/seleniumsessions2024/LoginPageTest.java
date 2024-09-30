package seleniumsessions2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		BrowerUtil brUtil = new BrowerUtil();
		
		WebDriver driver = brUtil.initWebDriver("Chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eleutil = new ElementUtil(driver);
		
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		eleutil.doSendKeys(email, "avats@gmail.com");
//		eleutil.doSendKeys(password, "Test@123");
		
		By continuebutton = By.xpath("//a[@class='btn btn-primary']");
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.name("telephone");
		By password = By.xpath("//input[@id='input-password']");
		By confirmpassword = By.cssSelector("#input-confirm");
		By privacycheckbox = By.name("agree");
		By continuebtn = By.xpath("//input[@value='Continue']");
		
		eleutil.doClick(continuebutton);
		eleutil.doSendKeys(firstname, "firstname");
		eleutil.doSendKeys(lastname, "lastname");
		eleutil.doSendKeys(email, "avats1@gmail.com");
		eleutil.doSendKeys(phone, "123456789");
		eleutil.doSendKeys(password, "Test@123");
		eleutil.doSendKeys(confirmpassword, "Test@123");
		eleutil.doClick(privacycheckbox);
		eleutil.doClick(continuebtn);
		
		Thread.sleep(10000);
		
		brUtil.quitBrowser();
		
	}

}
