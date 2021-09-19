/**
 * 
 */
package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class first {
WebDriver driver;

public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "/Users/anubhavsrivastava/Downloads/drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	
}
	public static void main(String[] args) {
		first obj = new first();
		obj.launchBrowser();

	}

}
