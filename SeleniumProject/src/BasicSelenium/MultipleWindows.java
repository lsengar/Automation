package BasicSelenium;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class MultipleWindows {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/");
		
		HashMap<String,String> windowns = new HashMap<>();
		
		
		//dr.close();  Close the Focussed window
		
		
		String mainwin=dr.getWindowHandle();
		System.out.println(mainwin);
		
		//dr.quit();  //Close all the Window opened by Webdriver
		
		Set<String> set =dr.getWindowHandles();
		for (String s:set)
			
		/*{
			System.out.println(s);
		}*/
			
			
			//For loop to close all the Child Window,only Main Focussed window will remain
		{
			dr.switchTo().window(s);
			System.out.println(dr.getTitle());
			
			//if (!s.equalsIgnoreCase(mainwin))
			//dr.close();
		}	
		
		dr.switchTo().window(mainwin);
		
		//dr.switchTo().window(mainwin); // Focus on mAin window again
		
		//dr.findElement(By.xpath("//div[text()='Login']")).click(); // on Main window click on the Login Link/button.Login Popup will open up
		
		
		//dr.switchTo().window("");
	}
	

}
