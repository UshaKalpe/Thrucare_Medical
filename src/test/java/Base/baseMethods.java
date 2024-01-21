package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import com.github.javafaker.Faker;


public class baseMethods {
	
	public static WebDriver driver;
	
	public static Faker f=new Faker();
	
	
	public static void browserselect(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
	}
	
	
	public static void openurl(String url)
	{
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void clickOnElement(String path)
	{
		driver.findElement(By.xpath(path)).click();
		
	}
	
	public static void SendkeyData(String path, String data)
	{
		 //data=f.name().firstName();
		
		driver.findElement(By.xpath(path)).sendKeys(data);
	}
	
	public static void LoginAftersucessful(String path)
	{		
		String Actualmsg=driver.findElement(By.xpath(path)).getText();
		 
		System.out.println("Actual Message:"+Actualmsg);
		
		Assert.assertEquals(Actualmsg, "Dashboard", "This is not matching");
	}
	

	public static void Verifyerror_message(String path)
	{		
				
		String Actualmsg=driver.findElement(By.xpath(path)).getText();
		 
		System.out.println("Actual Message:"+Actualmsg);
		
		Assert.assertEquals(Actualmsg, "Incorrect username or password.", "This is not matching");
	
	}
	
	public static void ForgotPassWordtitle(String path)
	{		
		String Actualmsg=driver.findElement(By.xpath(path)).getText();
		 
		System.out.println("Actual Message:"+Actualmsg);
		
		Assert.assertEquals(Actualmsg, "Forgot your password?", "This is not matching");
	}
	
	public static void AddSign(String path) {
	WebElement canvas = driver.findElement(By.xpath(path));
	
	         Actions builder = new Actions(driver);
         
	         builder.moveToElement(canvas, 0, 0).perform();
	      
	         builder.clickAndHold().perform();

	         // Simulate mouse movements to draw a signature
	         int[] signaturePointsX = {30, 40, 50, 60, 70}; // Replace with actual X coordinates
	         int[] signaturePointsY = {20, 25, 30, 35, 40}; // Replace with actual Y coordinates

	         for (int i = 0; i < signaturePointsX.length; i++) {
	             builder.moveByOffset(signaturePointsX[i], signaturePointsY[i]).perform();
	         }

	  
	         builder.release().perform();

	        
	     }
	 




   
	
	
	
	
	
	
	
	
	
	public static void CloseBrowser() 
	{
		driver.quit();
		
	}
	

}
