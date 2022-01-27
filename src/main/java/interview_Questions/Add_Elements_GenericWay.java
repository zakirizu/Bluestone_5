/**
 * Udemy-Section_27_Video_
 * Date: 2019-Sep-
 */
package interview_Questions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

/**
 * Acces the link = - https://rahulshettyacademy.com/seleniumPractise/#/
 * Add all the elements in one go using the loop in gengeric way
 * 
 * Blockers -
 * Add cart buttons has same xpath for all the 30 elements
 */
public class Add_Elements_GenericWay {
public static void main(String[] args) throws InterruptedException {
	    //ListOfItemsAvailable();
		ItemsToAddtoCart(); // Target three vegetables Cucumber ,Brocolli ,Cauliflower ,Beetroot ,Carrot 

	}
private static void ListOfItemsAvailable() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	//Now there is a single element saved in the below item product - As selelnium starts from left to right it will index 0 and click
	WebElement product = driver.findElement(By.xpath("//h4[@class='product-name']"));
	product.click(); // you will not see this in below products 
	
	//Now there are a total of 30 elements save in the below list
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
	
	System.out.println("# of Items available are "+products.size());
	
	for(int i=0;i<products.size();i++)
		
	{
		String name = products.get(i).getText();	
		System.out.println(products.get(i).getText());
		
	}
	
	driver.close();
}

private static void ItemsToAddtoCart() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
	
	//Target elements Whoes xpaths are to be added in weblist
	ArrayList<String> targetList = new ArrayList<String>();
	targetList.add("Cucumber");
	targetList.add("Brocolli");
	targetList.add("Tomato");
	targetList.add("Almonds");
	targetList.add("Nuts Mixture");
	targetList.add("Pista");
 	
	for ( int j=0;j<products.size();j++)
		
	{
		String[] trimmedName = products.get(j).getText().split("-"); //it retruns two srings 1. Brocoli and 2. 1 kg 
		String targetname = trimmedName[0].trim();
		
		if(targetList.contains(targetname)) {
			
			// This the index of this is changing as the text is getting update to "Added" from "Add to Cart" . hence 
			//we will not use the below xpath
//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	
			
			driver.findElements(By.xpath("//div[@class='product-action']")).get(j).click();
			
			
		}
		
	}
		
	
	driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
	driver.findElement(By.xpath("//button[text()= 'PROCEED TO CHECKOUT']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()= 'Place Order']")).click();
	//here is static drop down list - so we need to use Select class
	Thread.sleep(3000);
	Select slctcountry = new Select(driver.findElement(By.xpath("//select[@style='width: 200px;']")));
	slctcountry.selectByValue("India");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='India']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	
	
	driver.close();
}

/**
 * 
 */


}
