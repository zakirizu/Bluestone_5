package Selenium_Bluestone;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TODAY {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		
		WebElement About = driver.findElement(By.xpath("//div[text()='About']"));
		
		WebElement Help  = driver.findElement(By.xpath("//div[text()='Help']")); 
		
		WebElement API  = driver.findElement(By.xpath("//div[text()='API']")); 
		
		Thread.sleep(3000);
		About.click();
		
		Thread.sleep(3000);
		Help.click();
		
		Thread.sleep(3000);
		API.click();
		
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> ite = windows.iterator();
		
		while(ite.hasNext())
		{
			String childWindow = ite.next();
			driver.switchTo().window(childWindow);
			Thread.sleep(5000);
			String Text = driver.getTitle();
			System.out.println(Text);
			driver.close();
						
		}
		

	}

}
