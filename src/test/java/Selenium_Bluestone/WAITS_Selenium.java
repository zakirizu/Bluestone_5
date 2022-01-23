package Selenium_Bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAITS_Selenium {

	public static void main(String[] args) {
		Implicit_wait();
		Explicit_Wait();
		Fluent_Wait();
		

	}

	private static void Fluent_Wait() {
		// TODO Auto-generated method stub
		
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
