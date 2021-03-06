package section8udemy.section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Dropdown {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","/Users/anubhavsrivastava/Documents/Anubhav/Selenium/drivers/chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise");
	
	WebElement staticdd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dd = new Select(staticdd);
	dd.selectByIndex(3);
	System.out.println(dd.getFirstSelectedOption().getText());
	dd.selectByVisibleText("AED");
	System.out.println(dd.getFirstSelectedOption().getText());
	dd.selectByValue("INR");
	Thread.sleep(4000);
	
	// handling dropdowns in which no.of passengers needs to be updated
	
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	for (int i=0;i<5;i++) {                                                  //for multiple clicks
		driver.findElement(By.id("hrefIncAdt")).click();
	    }
	driver.findElement(By.id("btnclosepaxoption")).click();
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult"); //assertion based on expected and actual text.
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	Thread.sleep(3000);
	driver.close();
	}
}


