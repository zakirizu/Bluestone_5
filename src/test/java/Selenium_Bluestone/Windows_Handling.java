package Selenium_Bluestone;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);		
		WebElement AboutLink = driver.findElement(By.xpath("//div[text()='About']"));		
		WebElement HelpLink = driver.findElement(By.xpath("//div[text()='Help']"));		
		WebElement APILink = driver.findElement(By.xpath("//div[text()='API']"));
		
		Thread.sleep(3000);		
		AboutLink.click();
		
		Thread.sleep(3000);		
		HelpLink.click();
		
		Thread.sleep(3000);		
		APILink.click();
		
	//Now 4 Windows are open 
	//Getting the Handles of all the opened windows 
	//Return type for getWIndowHandles is Set of String
	//Return type for getWindowHandle is String	
		
		
		Set<String> AllHandles = driver.getWindowHandles();		
		Iterator<String>  ite =   AllHandles.iterator();
		
		
		while(ite.hasNext())
		{
			String childWindow = ite.next();
			
			Thread.sleep(3000);	
			driver.switchTo().window(childWindow);
			
			Thread.sleep(3000);	
			String CurrentTitle = driver.getTitle();
			
			System.out.println(CurrentTitle);
			
		}
		
		
		Thread.sleep(5000);	
		
		//THis quit method will close all the windows 
		driver.quit();
		
			
		//This close method will close the Current Windows in which the Driver is present
		//driver.close();
		
		
		
		
		
		
		

	}

}
