package scripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import configuration.config;
import libraries.ApplicationLib;
import libraries.Xls_Reader;
import pages.LoginPage;

public class TC_Login

{	
	WebDriver dr;
	@BeforeClass
	@Parameters({"browser"})
	public void preCondition(String browsername)
	{
		ApplicationLib lib = new ApplicationLib();
		
		dr=lib.launchBrowser(browsername);
		
		//launch browser
		//System.setProperty("webdriver.chrome.driver", config.chromeDriverPath);
		//ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(config.URL);
		
	}
	
	@AfterClass
	public void teardown()
	{
		dr.quit();
	}
	@Test(dataProvider="getData")
	public void script(String username ,String password, String title)
	
	{
		
		
		
		//Perform Login
			
		LoginPage obj_login = new LoginPage(dr);
		obj_login.login(username, password);
		
		//To Compare the Title of the Page
		System.out.println(dr.getTitle());
		System.out.println(title);
		assertEquals(dr.getTitle(), title.replace(" :", ":"));
		
		System.out.println("dgsdrfshgsfdhs");
		
		//dr.quit();

	}
	
	@DataProvider
	
	public String[][] getData() throws IOException
	{
		/*Xls_Reader xl = new Xls_Reader (config.testData);
		
		String[][] data = new String[2][3];
		//Row1
		data[0][0]="mercury";
		data[0][1]="mercury";
		data[0][2]="Find a Flight : Mercury Tours:";
		
		//Row1
		data[1][0]="mercury";
		data[1][1]="mercury";
		data[1][2]="Find a Flight : Mercury Tours:";*/

		
		
		Xls_Reader xl = new Xls_Reader (config.testData);
		
		String sheetName= this.getClass().getSimpleName(); // Sheet name will be Dynamic now ,not hardcoded
		
		int rows =xl.getrowcount(sheetName);
		int cols =xl.getColumncount(sheetName);
		
		String[][] data= new String[rows-1][cols];
		for (int r=2;r<=rows;r++)
		{
			for (int c=1;c<=cols;c++)
			//System.out.println(sheetName,r,c);
				
				data[r-2][c-1]=xl.getCellData(sheetName, r, c);
		}
		return data; //this array is of type String ans is 2 dimensional ,so teh Return type will be data here.
				
	}
}
