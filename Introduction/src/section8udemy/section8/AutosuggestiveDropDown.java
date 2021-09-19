package section8udemy.section8;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/anubhavsrivastava/Documents/Anubhav/Selenium/drivers/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List <WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));  //findElements is used because the CSS returns multiple objects and find elements  stores list of web elements.
		                                                              //parent child relationship format for CSS selector is used in autosuggestive DD
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}
		

	}

}
