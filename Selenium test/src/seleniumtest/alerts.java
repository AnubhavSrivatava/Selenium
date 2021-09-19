package seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"/Users/anubhavsrivastava/Documents/Anubhav/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		alert.accept();
		
		alerts obj = new alerts();
//		obj.popup();
		

	}


public void popup() throws InterruptedException, AWTException
   {
	
	WebDriver driver=new FirefoxDriver(); driver.get("Webpage link"); 
	driver.manage().window().maximize(); 
	Thread.sleep(3000);
	driver.findElement(By.id("PopUp")).click(); // Clicking on the popup button
	Robot robot = new Robot();
	robot.mouseRelease((int) 400.5); // Navigating through mouse hover. Note that the coordinates might differ, kindly check the coordinates of x and y axis and update it accordingly.
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(2000);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(2000);
	driver.quit();
	
	
    }    
}	
	
	