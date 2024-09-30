package seleniumsessions2024;

import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverBasics {


	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		String Title = driver.getTitle();
		System.out.println(Title);
		if (Title.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");	
		}
		driver.quit();
	}

}
