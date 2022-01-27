package selenium;

import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		

public class WindowsHandles_PopUps {				

    public static void main(String[] args) throws InterruptedException {									
    	System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();			
        		
     //Launching the site.				
        driver.get("http://demo.guru99.com/popup.php");			
        driver.manage().window().maximize();	                		
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
           		
        String MainWindow=driver.getWindowHandle();		
        		
        // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();
            
             		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                        driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);				
    }
}	