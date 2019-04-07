package SelPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_Demo {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		//Launching the site.				
        driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		
		

	}

}
