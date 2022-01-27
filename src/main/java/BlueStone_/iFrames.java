package BlueStone_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {
	
	SwitchTo_iFrame_By_ID();
	SwitchTo_iFrame_By_Name();
	SwitchTo_iFrame_By_Index();
	
	}

	private static void SwitchTo_iFrame_By_Index() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.switchTo().frame(0);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Create Your Learning Path']"));
		link.click();
		System.out.println("Worked with Index");
		
	}

	private static void SwitchTo_iFrame_By_Name() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.switchTo().frame("iframe-name");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Create Your Learning Path']"));
		link.click();
		System.out.println("Worked with Name");
		
	}

	private static void SwitchTo_iFrame_By_ID() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.switchTo().frame("courses-iframe");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Create Your Learning Path']"));
		link.click();
		System.out.println("Worked with ID");
		
			
	}

}
