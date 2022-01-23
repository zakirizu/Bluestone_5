package Selenium_Bluestone;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAITS_Selenium {

	public static void main(String[] args) {
		Implicit_wait();
		Explicit_Wait();
		Fluent_Wait();
		

	}

	private static void Fluent_Wait() {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();	

		//This is syntax upto version 3.1--No Longer used
	//	Wait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(30, TimeUnit.).ignoring(Exception.class);
		
	//This is the syntax above 3.1 version of selenium	
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(30)).ignoring(Exception.class);
		
	}

	private static void Explicit_Wait() {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();	
		
		WebElement Search = driver.findElement(By.xpath("//input[text()='Search']"));
		
		WebDriverWait expWait = new WebDriverWait(driver, 30);
		
		expWait.until(ExpectedConditions.visibilityOf(Search));
		
		Search.click();
		
	}

	private static void Implicit_wait() {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();		
	//Syntax for Inplicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
