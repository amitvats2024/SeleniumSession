package seleniumsessions2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ElementTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By header = By.tagName("h2");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By forgetpassword = By.linkText("Forgotten Password");
		By footerheader = By.tagName("h5");
		
		ElementUtil elUtil = new ElementUtil(driver);
		String s1 = elUtil.doGetElementText(header);
		String s2 = elUtil.doGetElementText(para);
		String s3 = elUtil.doGetElementText(forgetpassword);
		String s4 = elUtil.doGetElementText(footerheader);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
