package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///C:/10-02-2019 Selenium/Practice.html");
		
		//System.out.println(dr.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText());
		
		for (int r=2;r<=4;r++)
		{
			for (int c=1;c<=3;c++)
				
			{
				System.out.println(dr.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText());
			}
		}
			
	}

}
