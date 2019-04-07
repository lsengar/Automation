package BasicSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com");
		
		//dr.findElement(By.linkText("REGISTER")).click(); //---linktext 
		
		dr.findElement(By.partialLinkText("ISTER")).click();  //---partiallinktext 
		
		
		//Dropdown:
		
		WebElement ele = dr.findElement(By.name("country"));  // we can only handle those dropdowns which have SELECT Tag by Selct Class
		
		Select sel = new Select(ele);
		sel.selectByIndex(0);
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("INDIA");
		
		Thread.sleep(2000);
		
		sel.selectByValue("234");
		
	//Deselect all - Works with Multiselect Box ,for Single Select the Deselect method willl not work
		
		
	}

}
