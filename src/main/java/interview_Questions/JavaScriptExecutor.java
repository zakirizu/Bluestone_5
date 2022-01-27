/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Zoya ZR
 *
 */
public class JavaScriptExecutor {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java_Intallation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//opening the target URL
		driver.get("https://www.apsrtconline.in/");
		driver.findElement(By.xpath("//input[contains(@id,'fromPlaceName')]")).sendKeys("SHA"+Keys.ARROW_DOWN);
		
		Thread.sleep(4000);
		
		//JavaScript Executor
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		String FromPlace_arg = "return document.getElementById(\"fromPlaceName\").value;"; //- return is importatn here 
		String FromPlace_Text = (String) JS.executeScript(FromPlace_arg);
		System.out.println(" Value inside the Text Box = "+FromPlace_Text);
		
		while(!FromPlace_Text.equalsIgnoreCase("SHADNAGAR")) {
			driver.findElement(By.xpath("//input[contains(@id,'fromPlaceName')]")).sendKeys(Keys.ARROW_DOWN);
			String FromPlace_arg2 = "return document.getElementById(\"fromPlaceName\").value;"; //- return is importatn here 
			String FromPlace_Text2 = (String) JS.executeScript(FromPlace_arg);
			
			
			
			Thread.sleep(500);
			if(FromPlace_Text2.equalsIgnoreCase("SHADNAGAR")) {
				driver.findElement(By.xpath("//input[contains(@id,'fromPlaceName')]")).sendKeys(FromPlace_Text);
				driver.findElement(By.xpath("//input[contains(@id,'toPlaceName')]")).sendKeys("KURNOOL");
				driver.findElement(By.xpath("//input[contains(@id,'searchBtn')]")).click();
				break;
				
				
			}
		}
		

	
		
		
		

	}

}
