package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstTest {
	
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/anubhavsrivastava/Downloads/Selenium/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
	}
	public static void main(String[] args) {
			SeleniumFirstTest obj = new SeleniumFirstTest();
			obj.launchBrowser();

	}

}
