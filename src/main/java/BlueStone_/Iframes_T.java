package BlueStone_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_T {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Work_2\\chromedriver.exe");	
	
	//Frames();
	//Swtich_to_Frame_By_ID();
	//Switch_to_Frame_By_Name();
	Switch_to_frame_By_Index();
		
	}

private static void Switch_to_frame_By_Index() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
	driver.switchTo().frame(0);
	
	WebElement LearningpathLink = driver.findElement(By.xpath("//a[text()='Create Your Learning Path']"));
	LearningpathLink.click();
	
	System.out.println("I was Able to CLick Succesfully");
	
	
	
	
	
}

private static void Switch_to_Frame_By_Name() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.switchTo().frame("iframe-name");
	
	WebElement LearningpathLink = driver.findElement(By.xpath("//a[text()='Create Your Learning Path']"));
	LearningpathLink.click();
	
	System.out.println("I was Able to CLick Succesfully");
	
}

private static void Swtich_to_Frame_By_ID() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
	driver.switchTo().frame("courses-iframe"); //Switching to Frame By ID
	
	WebElement LearningpathLink = driver.findElement(By.xpath("//a[text()='Create Your Learning Path']"));
	LearningpathLink.click();
	
	System.out.println("I was Able to CLick Succesfully");
	
}

private static void Frames() {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
	WebElement LearningpathLink = driver.findElement(By.xpath("//a[text()='Create Your Learning Path']"));
	LearningpathLink.click();
	
	System.out.println("I was Able to CLick Succesfully");
	
	
	
	
	
	
	
}
	
	
}
