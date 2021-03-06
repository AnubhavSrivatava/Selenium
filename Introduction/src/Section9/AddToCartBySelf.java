package Section9;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartBySelf {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/anubhavsrivastava/Documents/Anubhav/Selenium/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    //implicit wait
		String[] Itemsneeded = {"Cauliflower","Cucumber","Brinjal"};
		AddToCartBySelf obj1= new AddToCartBySelf ();
		obj1.additems(driver,Itemsneeded);
		
	}
	
	
	
	public void additems(WebDriver driver,String[] itemsneeded) throws InterruptedException 
	{
        
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		
		List<WebElement> product = driver.findElements(By.cssSelector(".product-name"));
		int i,j=0;
		for(i=0;i<product.size();i++) 
		{
			System.out.println(product.get(i).getText());
			String[] name =product.get(i).getText().split("-");
			String formattedname =name[0].trim();
			System.out.println(formattedname);
			List <String> itemnamelist=Arrays.asList(itemsneeded);
			if (itemnamelist.contains(formattedname)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();	
				j++;
				if (j == itemsneeded.length)
					break;
				}
		}
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".cart-icon")).click();
		WebDriverWait w =new WebDriverWait(driver,5);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='promoBtn']")));   //explicit wait
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		Thread.sleep(5000);
		driver.close();
	}

}
