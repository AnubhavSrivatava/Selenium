package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/anubhavsrivastava/Downloads/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
