package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElements {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/anubhavsrivastava/Downloads/Selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlusNord");
        Thread.sleep(3000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Redmi")).click();
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.quit();
        

	}

}
