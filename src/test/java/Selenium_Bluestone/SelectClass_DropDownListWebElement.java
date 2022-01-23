package Selenium_Bluestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectClass_DropDownListWebElement {

	public static void main(String[] args) throws InterruptedException {
	
		
			//	Select_By_value();
			// Select_By_VisibleText();
		     //  Select_by_Index();
		SelectingMultipleValues_ddl();	

	}

	private static void SelectingMultipleValues_ddl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement SeleCommand_multiple = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		
		Select sc = new Select(SeleCommand_multiple);
		Thread.sleep(5000);
	//Index will start from 0 
		sc.selectByIndex(1);
		Thread.sleep(5000);
		sc.selectByIndex(3);
		
		
		
		
		
	}

	
	
	
	
	
	private static void Select_by_Index() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
	//Selecting a value from Drop Down List
		WebElement SSCBoard_ddl = driver.findElement(By.xpath("//select[@id='userProperties(ssctype)']"));
		Thread.sleep(5000);
		Select sc = new Select(SSCBoard_ddl);
		Thread.sleep(5000);
		sc.selectByIndex(0);
		
		Thread.sleep(5000);
		sc.selectByIndex(1);
		
		Thread.sleep(5000);
		sc.selectByIndex(2);
		
		Thread.sleep(5000);
		sc.selectByIndex(3);
		
		Thread.sleep(5000);
		sc.selectByIndex(4);
		
	}

	private static void Select_By_VisibleText() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
	//Selecting a value from Drop Down List
		WebElement SSCBoard_ddl = driver.findElement(By.xpath("//select[@id='userProperties(ssctype)']"));
		Thread.sleep(5000);	
		Select sc = new Select(SSCBoard_ddl);
		Thread.sleep(5000);
		sc.selectByVisibleText("Other Board");
		Thread.sleep(5000);
		sc.selectByVisibleText("AP SSC");
		Thread.sleep(5000);
		driver.close();
		
	}

	private static void Select_By_value() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
	//Selecting a value from Drop Down List
		WebElement SSCBoard_ddl = driver.findElement(By.xpath("//select[@id='userProperties(ssctype)']"));
		Thread.sleep(5000);		
		Select sc = new Select(SSCBoard_ddl); 		
		sc.selectByValue("icse");		
		Thread.sleep(5000);		
		sc.selectByValue("R");
		
		
	}

}
