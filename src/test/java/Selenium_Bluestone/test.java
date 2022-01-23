package Selenium_Bluestone;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*2)	Desktop application has multiple windows created for various functional workflow and 
 * each window is associated with unique id, so that the application which controls the desktop 
 * client can get associated handle based on unique id and perform UI controls on that specific window.
 * Write a class to manage the window handles of desktop application in your test application like
 * addwindow (when new window is created) by creating and associating a unique id for the window 
 * handle, deletewindow (when window goes out of scope or destroyed) , getwindow to get the window handle.

*/

public class test {

	public static void main(String[] args) 
	{
		KeyWord_Question();
		//Windows_Question();
	}

	private static void KeyWord_Question() {
		
		String given 	= "State: idle State: connected";
		String keyWord 	= "State";
		int given_len 	= given.length();
		int keyWord_len = keyWord.length();
		int i =0;
		while(i<given_len)
		{
			int index = given.indexOf(keyWord, i);
			System.out.println(index);
			i=i+5;
			
		}
		
		
	
		
		
		/*
		System.out.println(given.length());
		System.out.println(given.contains("State:"));
		
		
		System.out.println(given.indexOf("State"));
		
		
		
		int x = given.indexOf("State", 4);
		
		System.out.println(x);
		
		*/
		
		
		
	}

	private static void Windows_Question() {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		String UniqueID = "xyz"; //This is subject to change we can use get text method to get value of this
		
	//Getting the current Window location of the driver and storing it in a variable 
		String parent = driver.getWindowHandle();
		
	//Now Getting all the windows and storing inside a set 
		Set<String>  allWindows = driver.getWindowHandles();
		Iterator<String> ite = allWindows.iterator();
		while(ite.hasNext())
		{
			
			driver.switchTo().window(UniqueID);
			
			/*find elements and perform all the actions on that windows
			{
			//code to find
			//Code to perform actions
			}
			*/
			
			//Now Closing the window
			driver.close();
			
			//Now Moving to the Parent window where were actually
			driver.switchTo().window(parent);
			
			
		}
		
		
	}

	

	}


