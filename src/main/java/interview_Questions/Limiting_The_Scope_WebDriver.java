/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Limiting_The_Scope_WebDriver {

	/**
	 * Aim- Count of the links in the given area only
	 * How - create a local element in which all the targer links are available
	 * Then - Search the count of the links in the target elements
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LimitScope();

	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	private static void LimitScope() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Count of all links in the page
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		int allLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Count of all the links is "+allLinks);
		
		//Count of the Links in the given area
		WebElement limitedScope = driver.findElement(By.xpath("//div[@class='gradient']"));
		int limitedCount = limitedScope.findElements(By.tagName("a")).size();
		System.out.println("Count of the Links in the Given Area is "+limitedCount);
		
		//Now Clicking on the links and opening all the links in a seperate tab
		for(int i=0;i<limitedScope.findElements(By.tagName("a")).size();i++)
			
		{
			String clickNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			limitedScope.findElements(By.tagName("a")).get(i).sendKeys(clickNewTab);
			Thread.sleep(2000);
			//Note that all the keyboard actions should be send via sendkeys
		}
		
		
		
		
		
		
	}

}
