/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_UI {

	public static void main(String[] args) throws InterruptedException {
		
		Calender_Target_Date_Selection(); // Select Month "August 08"
		Calender_Target_Month_Selection(); // Select Date= "26th of Current Month"
		
		
	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	private static void Calender_Target_Month_Selection() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		
		List<WebElement> months = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']//div"));
		
		
		for(int j=0;j<12;j++)
		{
			months.get(j).click();
			months.get(j).sendKeys("test");
			months.get(j).getText();
		
			}
		
		
		for(int i=0;i<12;i++)
		{
			
			for(int j=1;j<months.size();j++) {
			String temp = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']//div")).get(j).getText();
			if(temp.equals("August 2020")) {
				driver.findElements(By.xpath("//p[text()='8']")).get(j).click();
				Thread.sleep(3000);
				driver.close();
				break;
			}
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
				
			
			
		}
		
		
	}

	/**
	 * @throws InterruptedException 
	 * 
	 */
	private static void Calender_Target_Date_Selection() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java_Intallation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='dateInnerCell']"));
		int count = dates.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
			
		{
			String temp = driver.findElements(By.xpath("//div[@class='dateInnerCell']//p[1]")).get(i).getText();
			if(temp.equals("26"))
			{
				
				driver.findElements(By.xpath("//div[@class='dateInnerCell']")).get(i).click();
				Thread.sleep(3000);
				break;
			}
			
		}
		
		driver.close();
		
		
		
		
	}

}
