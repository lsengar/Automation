package BasicSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lokesh\\Downloads\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///C:/10-02-2019 Selenium/Downloaded Stuff/Practice.html");
		dr.findElement(By.id("Anand_file")).click();
		
		Robot robot = new Robot();
		StringSelection cb = new StringSelection ("C:\\10-02-2019 Selenium\\Downloaded Stuff\\testrobot.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);
				
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}


