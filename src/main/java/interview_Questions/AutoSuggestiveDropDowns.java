/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class AutoSuggestiveDropDowns {
	public static void main(String[] args) throws InterruptedException {
		AutoSuggestive1();

	}



	private static void AutoSuggestive1() throws InterruptedException {
		
//Settting the System properties and Creating Driver web elemnet
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//Creation of Action Class 
		Actions Act = new Actions(driver);
//Invoking the Target URl
		driver.get("https://www.apsrtconline.in/oprs-web/");

//Entering the From Date
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Sha");
		for(int i=0;i<14;i++)
		{
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		}
		
		
		driver.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("Kurnool");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}