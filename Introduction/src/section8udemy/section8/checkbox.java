package section8udemy.section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/anubhavsrivastava/Documents/Anubhav/Selenium/drivers/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());  // tells number of checkboxes present
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
	    System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected()); //tells if the box is selected or not
	    driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
	//  Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected()); //Assertion syntax . Here assertion is put to false but condition is true therefore execution stops and last line does not get printed.
	    System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		

	}

}
