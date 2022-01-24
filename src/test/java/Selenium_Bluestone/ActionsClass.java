package Selenium_Bluestone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
	
		//Right_Click();
		//Double_Click();
		//Hover_Mouse();
		//Drag_Drop();

}

	private static void Drag_Drop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		
		WebElement From_Element = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement To_Element	= driver.findElement(By.xpath("//div[@id='droppable']"));
		
	//Actions Class --- Drag and Drop Action Using 
		Actions ac = new Actions(driver);
		Thread.sleep(5000);
		ac.dragAndDrop(From_Element, To_Element).build().perform();
		Thread.sleep(5000);
		
	//Close browser
		driver.close();	
		
		
	}

	private static void Hover_Mouse() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/hovers");
		Thread.sleep(5000);
		WebElement FirstImage = driver.findElement(By.xpath("//img[@alt='User Avatar']"));
		
	//Actions Class  --- Performing a Hover Action Using MoveToElement Method 
		Actions ac = new Actions(driver);
		Thread.sleep(5000);
		ac.moveToElement(FirstImage).build().perform();
		Thread.sleep(9000);
		
	//closing the browser
		driver.close();
		
		
	}

	private static void Double_Click() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver feroz = new ChromeDriver();		
		feroz.manage().window().maximize();
		feroz.get("https://mousetester.com/");
		Thread.sleep(5000);
		
		WebElement clickMe_Button = feroz.findElement(By.xpath("//div[@id='clickMe']"));
		Thread.sleep(5000);
		
	//Actions Class -- Performing Double Click 
		Actions zakir = new Actions(feroz);
		zakir.doubleClick(clickMe_Button).build().perform();
		Thread.sleep(7000);
		
		feroz.close();
		
		
		
	}

	private static void Right_Click() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		Thread.sleep(5000);				
		WebElement Rectangle_Area = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Thread.sleep(5000);		
		
	//Actions Class -- 
		Actions ac = new Actions(driver);
		ac.contextClick(Rectangle_Area).build().perform();
		Thread.sleep(3000);	
	//Alerts
		driver.switchTo().alert().accept();
		Thread.sleep(3000);	
		
		driver.close();		
				
	}
}

