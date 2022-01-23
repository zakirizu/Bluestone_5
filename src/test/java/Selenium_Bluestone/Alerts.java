package Selenium_Bluestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		//Alerts_Accept_GetText();
		//Alerts_Dimiss();  //Dismiss method is used to click on cancel button on an Alert
		Alerts_Accept();  //Accept method is used to click on OK button on an Alert

	}

	private static void Alerts_Accept() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");		
		WebElement CustomerID_TextBox 		= driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_Button		 	= driver.findElement(By.xpath("//input[@name='submit']")); 
		
		CustomerID_TextBox.sendKeys("9703939349");
		Submit_Button.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
		
	}

	private static void Alerts_Dimiss() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");		
		WebElement CustomerID_TextBox 		= driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_Button		 	= driver.findElement(By.xpath("//input[@name='submit']")); 
		
		CustomerID_TextBox.sendKeys("9703939349");
		Submit_Button.click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.close();
		
		
	}

	private static void Alerts_Accept_GetText() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		String Expected_Message = "Successfully Deleted!";
		
		WebElement CustomerID_TextBox 		= driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_Button		 	= driver.findElement(By.xpath("//input[@name='submit']")); 
		
		CustomerID_TextBox.sendKeys("9703939349");
		Submit_Button.click();
		
	//using Alerts ---
		Thread.sleep(5000);
		driver.switchTo().alert().accept();		
		Thread.sleep(5000);
		String Actual_Message = driver.switchTo().alert().getText();
		
			
		if(Expected_Message.equals(Actual_Message))
		{
			
			System.out.println("Message is Same - Test Case is PASS");
			
		}
		
		else
		{
				
			System.out.println("Message is Not Same - Test Case is FAIL");
				
		}
		}
		
	
		
	}


