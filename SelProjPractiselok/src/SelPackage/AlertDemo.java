package SelPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException
	
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	// Alert Message handling
	
	driver.get("http://demo.guru99.com/test/delete_customer.php");
		
	driver.findElement(By.name("cusid")).sendKeys("53920");
	driver.findElement(By.name("submit")).submit();
	
	// Switching to Alert
	Alert alert = driver.switchTo().alert();
	
	// Capturing alert message. 
	String alertMessage= driver.switchTo().alert().getText();
	
	// Displaying alert message
	System.out.println(alertMessage);
	Thread.sleep(5000);
	
	// Accepting alert
	alert.dismiss();
	
	
	
	
	
	}

}
