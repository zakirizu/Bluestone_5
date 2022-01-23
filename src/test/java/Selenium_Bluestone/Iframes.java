package Selenium_Bluestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		//SwitchToFrame_By_Id();
		//SwitchToFrame_By_Index();
		SwitchToFrame_By_WebElement();
		
		}

	private static void SwitchToFrame_By_WebElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();	
		driver.get("https://the-internet.herokuapp.com/iframe");
	//Switch to Frame By WebElement 
		WebElement iframe_xpath = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));		
		driver.switchTo().frame(iframe_xpath);
		
		
		Thread.sleep(5000);		
		WebElement Message_TextBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		Message_TextBox.clear();
		
		Thread.sleep(5000);
		Message_TextBox.sendKeys("Bluestone");
		
		Thread.sleep(5000);
		Message_TextBox.clear();
		
		Thread.sleep(5000);
		Message_TextBox.sendKeys("Zakir Hussain From Bluestone");
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

	private static void SwitchToFrame_By_Index() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();	
		driver.get("https://the-internet.herokuapp.com/iframe");
	//Switching to frame by Index
		driver.switchTo().frame(0);
		
		Thread.sleep(5000);		
		WebElement Message_TextBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		Message_TextBox.clear();
		
		Thread.sleep(5000);
		Message_TextBox.sendKeys("Bluestone");
		
		Thread.sleep(5000);
		Message_TextBox.clear();
		
		Thread.sleep(5000);
		Message_TextBox.sendKeys("Zakir Hussain From Bluestone");
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

	private static void SwitchToFrame_By_Id() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();	
		driver.get("https://the-internet.herokuapp.com/iframe");
		
	//switch to Iframe By ID 
		
		driver.switchTo().frame("mce_0_ifr");
		
		Thread.sleep(5000);
		
		WebElement Message_TextBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		Message_TextBox.clear();
		
		Thread.sleep(5000);
		Message_TextBox.sendKeys("Bluestone");
		
		Thread.sleep(5000);
		Message_TextBox.clear();
		
		Thread.sleep(5000);
		Message_TextBox.sendKeys("Zakir Hussain From Bluestone");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
