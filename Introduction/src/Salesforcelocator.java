import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforcelocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/anubhavsrivastava/Documents/Anubhav/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[contains(@class,'input')]")).sendKeys("anubhav");
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("passsword");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
