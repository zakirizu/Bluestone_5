/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Zoya ZR
 *
 */
public class Title_All_Windows_Iterator {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * driver.manage().window().maximize()
	 * driver.switchTo().window(it.next())
	 * driver.getTitle()	
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement limitedScope = driver.findElement(By.xpath("//div[@id='pageFooterChildren']"));
		int limitedlinksCount = limitedScope.findElements(By.tagName("a")).size();
		System.out.println("Count of links in the Target Area = "+limitedlinksCount);
		
		for(int i=0;i<5;i++)
		{
			
			String NewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			limitedScope.findElements(By.tagName("a")).get(i).sendKeys(NewTab);
			Thread.sleep(1000);	
			
		
			/*
			 **********We are not using this click() method because we will gill Stale Element Reference error method*****
			limitedScope.findElements(By.tagName("a")).get(i).click();
			Thread.sleep(1000);
			*/
		}
		
//Now getting the links of the all tabs
		Set<String> handles_count = driver.getWindowHandles();
		Iterator<String> it = handles_count.iterator();
			
		System.out.println("Count of windows is "+handles_count.size());
		
		
		while(it.hasNext())
			
		{
			driver.switchTo().window(it.next());
			String temp = driver.getTitle();
			System.out.println(temp);
			Thread.sleep(500);
			
		}
				

	}

}
