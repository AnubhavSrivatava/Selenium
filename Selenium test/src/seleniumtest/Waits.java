package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//this script is not running

public class Waits {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/anubhavsrivastava/Downloads/Selenium/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
	//	driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("guitar");
    //    Thread.sleep(3000);
    //    driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).click();
        
    //    driver.navigate().to("https://www.facebook.com/");
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement clickpassword = driver.findElement(By.xpath("//button[@id='u_0_j_6V']"));
        
       sendKeys(driver,email,10,"anubhavsrivastavahcl@gmail.com");
       sendKeys(driver,password,10,"Portal_123");
        clickon(driver,clickpassword,10);
        driver.close();
        
	}
    public static void sendKeys(WebDriver driver1,WebElement element,int timeout,String value)
        {
        	new WebDriverWait(driver1,timeout).until(ExpectedConditions.visibilityOf(element));
        	element.sendKeys(value);
        	
 	
        	
        }
        
        
     public static void clickon(WebDriver driver1,WebElement element,int timeout)   
     {
    	new WebDriverWait(driver1,timeout).until(ExpectedConditions.elementToBeClickable(element));
    	element.click();
    	 
    	 
     }
        		
        
	

}
