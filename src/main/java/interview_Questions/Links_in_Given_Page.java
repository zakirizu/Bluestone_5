/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Links_in_Given_Page {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	
	
	LinksinPage();
	
	
	}

private static void LinksinPage() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//Links in whole page
	driver.get("http://www.qaclickacademy.com/");
	driver.manage().window().maximize();
	int linkCountInPage = driver.findElements(By.tagName("a")).size();
	System.out.println("#Links in given page are "+linkCountInPage);
	
	//Links in the part of the Page(Target Page)
	WebElement TargetArea = driver.findElement(By.xpath("//section[@id='content']"));
	int linkCountInSpecificAreaOfPage = TargetArea.findElements(By.tagName("a")).size();
	System.out.println("# Links in Target area of the page are "+linkCountInSpecificAreaOfPage);
	driver.close();
	
	
	
}

/**
 * 
 */

	


}
