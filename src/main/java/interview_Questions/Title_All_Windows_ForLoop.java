/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Zoya ZR
 *
 */
public class Title_All_Windows_ForLoop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
			
		WebElement limitedScope = driver.findElement(By.xpath("//div[@id='pageFooterChildren']"));
		int limitedlinksCount = limitedScope.findElements(By.tagName("a")).size();
		System.out.println("Count of links in the Target Area is "+limitedlinksCount);
		
		for(int i=0;i<5;i++)
		{
			String NewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			limitedScope.findElements(By.tagName("a")).get(i).sendKeys(NewTab);
			
			Thread.sleep(100);		
			
		}
		
		
		
		Set<String> handles = driver.getWindowHandles();
		int handlesCount = handles.size();
		System.out.println("handlesCount "+handlesCount);
		
		int j = 0;
		
		for(int i=0; j<handlesCount;i++,j++)
		
		{
			driver.switchTo();
			
		//	String name = driver.getWindowHandles();
			System.out.println(driver.getTitle());
		
		}
		

		driver.close();
		driver.quit();
		

	}

}
