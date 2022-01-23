package Selenium_Bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_in_Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		Thread.sleep(5000);
		
		Actions ac = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		WebDriverWait ewait = new WebDriverWait(driver, 30);
		
		
		
		WebElement start_Button = driver.findElement(By.xpath("//div[@id='start']"));
		
		System.out.println(start_Button.isDisplayed());
		
		ac.click(start_Button);
		
		WebElement HelloWord_link = driver.findElement(By.xpath("//div[@id='finish']"));
		
		start_Button.click();
		
		if(HelloWord_link.isDisplayed())
		{
			System.out.println("Hello World is Visible");
		}
		
		else
		{
			System.out.println("Hello World is Not Visible");			
		}
		
		
		

	}

}
