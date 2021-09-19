package section8udemy.section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Disabledattribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/anubhavsrivastava/Documents/Anubhav/Selenium/drivers/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//solution 1
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()); //this returns true but ideally it should be false, hence this way of finding wheather item is enabled or disabled is not always reliable
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		//solution2 using styles and color of the field
		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style"));
		if (driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("1")) {    //if style is 1 then its enables and 0.5 then its disabled
			System.out.println("Is enabled ");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Disabled");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(3000);
		driver.close();

	}
	
}
