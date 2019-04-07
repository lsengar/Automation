package BasicSelenium;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectBx {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///C:/10-02-2019 Selenium/Downloaded Stuff/Practice.html");
		
		Select sel = new Select (dr.findElement(By.tagName("select")));
		
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		
		sel.deselectAll();
		

	}

}
