package Selenium_Bluestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		
		WebElement firstName 	= driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastName 	= driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement sexmale 		= driver.findElement(By.xpath("//input[@value='Male']"));
		WebElement exp7 		= driver.findElement(By.xpath("//input[@value='7']"));
		WebElement date 		= driver.findElement(By.xpath("//strong[text()='Date:  ']/following::input[1]"));
		WebElement ManualTester = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		WebElement  AutoTester	= driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		
		
	//Sendkeys method to enter data into text box
	//Click method to click on Radio Button 
	//Click method to click on Check Box 
		
		firstName.sendKeys("Zakir");
		Thread.sleep(5000);
		
		lastName.sendKeys("Shaik");
		Thread.sleep(5000);
		
		sexmale.click();
		Thread.sleep(5000);
		
		exp7.click();
		Thread.sleep(5000);
		
		date.sendKeys("19-01-2022");
		Thread.sleep(5000);
		
		ManualTester.click();
		Thread.sleep(5000);
		
		AutoTester.click();
		Thread.sleep(5000);
		
		driver.close();
		
		
		

	}

}
