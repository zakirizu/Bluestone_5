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

public class Tables {
public static void main(String[] args) {
	Table1();
	}

/**
 * In the below table we will add a table (Innings played by scottland) and get scores of all the batmans in the team
 */
private static void Table1() {

//Settting the System properties and Creating Driver web elemnet
	System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();	

//Invoking the target url and creating a target table 
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23410/sco-vs-ken-8th-match-group-a-icc-mens-t20-world-cup-qualifier-2019");
	WebElement tableFirstInnings = driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]"));

//Getting the Count of rows in a given table
	int rows_size = tableFirstInnings.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
	List<WebElement> batsman = tableFirstInnings.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[1]"));
	List<WebElement> runs = tableFirstInnings.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]"));
	
	System.out.println("No of Rows in the Given Table are "+rows_size);
	System.out.println("");
	

//getting the score of the batsman
	for(int i=0;i<rows_size-3;i++)
	{
		
		String batsman_name = batsman.get(i).getText();
		String batsman_score = runs.get(i).getText();
		
		System.out.println(batsman_name +" = "+batsman_score);
	}
	
//Closing the WebDriver
	//driver.close();
	driver.quit();
	
}

}
