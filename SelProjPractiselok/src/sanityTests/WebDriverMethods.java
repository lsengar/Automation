package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		//driver.manage().window().maximize();
		//String Title = driver.getTitle();  //To Get the Title of the Webpage Opened
		//System.out.println(Title);  // Output :---Google
		//String stringName = driver.getPageSource();
		
		//String stringName = driver.getCurrentUrl();
		//System.out.println(stringName);
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.navigate().to("https://login.yahoo.com");
		//URL=driver.getCurrentUrl();
		//System.out.println(URL);
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		System.out.println("hello");
		boolean a = driver.findElement(By.xpath("//a[@class='gb_ie gb_1 gb_gb']")).isSelected();
		System.out.println(a);
		
		
		//driver.quit();
		}

}


