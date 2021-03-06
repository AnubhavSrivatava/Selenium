package section8udemy.section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignmentcheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/anubhavsrivastava/Documents/Anubhav/Selenium/drivers/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isEnabled());

		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Assert.assertEquals(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected(), false);
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
        Thread.sleep(4000);
        driver.close();

	}

}
