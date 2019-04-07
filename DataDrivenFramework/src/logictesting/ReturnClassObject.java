package logictesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configuration.config;

public class ReturnClassObject

{
	public int test()
	{
		return 10;
	}
	
	
	public ChromeDriver test2()
	{
		ChromeDriver dr = new ChromeDriver();
		return dr;
	}
	
	public WebDriver test3(String browserName)
	
	{
		WebDriver dr= null;
		
		if (browserName.equalsIgnoreCase("Chrome"))
			
		{
			
			System.setProperty("webdriver.chrome.driver", config.chromeDriverPath);
			dr = new ChromeDriver();
			
		}else if (browserName.equalsIgnoreCase("Firefox"))
			
		{
			dr= new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("edge"))
		{
			dr = new EdgeDriver();
		}
		
		return dr;
		
	}
	
}


