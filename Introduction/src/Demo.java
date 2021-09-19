import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/anubhavsrivastava/Documents/Anubhav/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("anubha");
		driver.findElement(By.cssSelector("input#password.input.r4.wide.mb16.mt8.password")).sendKeys("hello");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.id("error")).getText());
//	    driver.findElement(By.id("error")).getText();
		driver.close();

	}

}
