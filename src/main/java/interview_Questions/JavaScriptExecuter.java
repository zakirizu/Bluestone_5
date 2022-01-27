/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {
public static void main(String[] args) throws InterruptedException {
	//HiddenElementonUI();	
	javaScriptExecuter1();

	}

/**
 * Few of the times elements get hidden in the WebPage and cannot be found usng Selenium Tool 
 * Selenium Cannot find the elements which are implemented via AJAX
 * Try using the get text method if you are getting the text - then we can say that the text is hidden
 * Then comes the super Hero JavaScript DOM - Features of the JavaScript Executer
 * 
 * Java Script Executer DOM 
 * - This is one of the API (Applicaiton Programming Interface)
 * - JS DOM can Extract the hidden elements on the page
 * @throws InterruptedException 
 * 
 * 
 */
private static void HiddenElementonUI() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//opening the target URL
	driver.get("https://www.apsrtconline.in/");
	driver.findElement(By.xpath("//input[contains(@id,'fromPlaceName')]")).sendKeys("Kur"+Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[contains(@id,'fromPlaceName')]")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	
		//Now there is a text in the FromPlace Text box - we are trying to get the text of that
	String TextInFromPlace = driver.findElement(By.xpath("//input[contains(@id,'fromPlaceName')]")).getText();
	System.out.println("The value in the From Place is "+TextInFromPlace);
	System.out.println("See the Magic :-) Text inside the Text box is not displayed");
	driver.close();	
}


private static void javaScriptExecuter1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Java_Intallation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//opening the target URL
	driver.get("https://www.apsrtconline.in/");
	driver.findElement(By.xpath("//input[contains(@id,'fromPlaceName')]")).sendKeys("Kur"+Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[contains(@id,'fromPlaceName')]")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	
//Define the JavascriptExecutor API
	JavascriptExecutor JS = (JavascriptExecutor)driver;
	
	//document.getElementById("fromPlaceName").value; -- Line1
	//- Note that the above line will not perform any opertaion and it just returns a string
	//- We need to give this string as input to JS 
	//Coverting the Line1 into the string
	//"document.getElementById("fromPlaceName").value;" - Line2
	//Again there is a problem java will not accept "" within ""  sp we use forward slash infront of the " 
	//"document.getElementById(\"fromPlaceName\").value;" - Line2
	// Now our string is 
	
	String FromPlaceNoReturn = "document.getElementById(\"fromPlaceName\").value;";
	
	
	//Below code will run and return a text 
	JS.executeScript(FromPlaceNoReturn);
	
	String JSwithNoReturn = (String) JS.executeScript(FromPlaceNoReturn);
	//This will return null as there was no return defined in the statement.
	System.out.println("NO return type in the script");
	System.out.println("Values inside the from place = "+JSwithNoReturn);
	System.out.println("");
	
	
	String FromPlacewithReturn = "return document.getElementById(\"fromPlaceName\").value;";
	
	
	//Below code will run and return a text 
	JS.executeScript(FromPlacewithReturn);
	
	String JSwithReturn = (String) JS.executeScript(FromPlacewithReturn);
	//This will return null as there was no return defined in the statement.
	System.out.println("Return type in the script");
	System.out.println("Value inside the from place = "+JSwithReturn);
	driver.close();
	
	
	
	
	
	
}

}
