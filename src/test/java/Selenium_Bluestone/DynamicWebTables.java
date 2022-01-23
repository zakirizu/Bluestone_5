package Selenium_Bluestone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTables {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		//driver.get("https://en.wikipedia.org/wiki/Bismillah");
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td"));		
		int Row_Count  = rows.size();
		int Column_Count  = columns.size();
		System.out.println("Total Rows Count = "+Row_Count);
		System.out.println("Total Columns Count ="+Column_Count);
		
		for(int i=1;i<Row_Count;i++)
		{			
			
			for(int j=1;j<Column_Count;j++)
				{
					WebElement Target = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));			
			 		String text = Target.getText();
			 		System.out.println(text);
			 		
			 		if(text.equals("HDIL"))
			 		{
			 			Target.click();			 			 			
			 		}
			 		//This Piece of Code will Retrun all the text values inside the table.
			 		//Now You can add a if statement and get the text from the table and then compare the text which you are looking for 
			
			 	}
			
		}
		
		
		Thread.sleep(10000);
		driver.close();
	
		
		
		
		
		
		
		
		
	}

}
