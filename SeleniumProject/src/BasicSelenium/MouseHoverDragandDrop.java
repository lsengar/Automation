package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverDragandDrop {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Implicit : Wait for element on DOM
		//Explicit : Wait for Specific Property of an Element
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		//MOuse Hover : Use Actions Class
		
		Actions act= new Actions(dr);
		
		WebElement ele = dr.findElement(By.xpath("//span[text()='Women']"));
		
		act.moveToElement(ele).build().perform();  //Use when we use Mouse Hover related opearations and Actionc Class
		
		WebDriverWait wait = new WebDriverWait(dr,2);
		
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Flats']"))));
		 //Use Explicit wait to wait for Specific Property of an Element
		
		//Thread.sleep(2000); 
		
		dr.findElement(By.xpath("//a[text()='Flats']")).click();
		
		
		
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("(//div [@class='_3aQU3C'])[1]"))));
		act.dragAndDropBy(dr.findElement(By.xpath("(//div [@class='_3aQU3C'])[1]")),50,0).build().perform();
		
	}

}
