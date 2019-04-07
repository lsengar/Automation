package SelPackage;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) 
	{
		
		//Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com");
		
		
		//URL OPening Script
		
		/*dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name ='password']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='login']")).click();
		dr.close(); */
		
		//CLick on Support
		//dr.findElement(By.linkText("SUPPORT")).click();
		//dr.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
		
		//Click on Contact
		
		//dr.findElement(By.linkText("CONTACT")).click();
		//dr.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
		
		//Click on SIGN-ON and Login Page
		
		//dr.findElement(By.linkText("SIGN-ON")).click();
		//dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		//dr.findElement(By.xpath("//input[@name ='password']")).sendKeys("mercury");
		//dr.findElement(By.xpath("//input[@name='login']")).click();
		//dr.findElement(By.linkText("SIGN-OFF")).click();
		
		//dr.close();
		
		//Flight Itinerary Script for One Way
		
	    dr.findElement(By.linkText("SIGN-ON")).click();
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name ='password']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='login']")).click();
		
		
		 
		//--------------------------ITINERARY PAGE SCRIPT--------------------------**********
		
		
		//Flight Details :
		
		 dr.findElement(By.xpath("//input[2][@value='oneway']")).click();				
	     dr.findElement(By.xpath("//input[1][@value='roundtrip']")).click();
	     //dr.findElement(By.xpath("//input[2][@value='oneway']")).click();
	     
	     
	     Select drpPassenger = new Select(dr.findElement(By.name("passCount")));
	     drpPassenger.selectByVisibleText("1");
	     
	     Select drpfromPort = new Select(dr.findElement(By.name("fromPort")));
	     drpfromPort.selectByVisibleText("London");
	     
	     Select drpdateFrmMonth = new Select(dr.findElement(By.name("fromMonth")));
	     drpdateFrmMonth.selectByVisibleText("March");
	     
	     Select drpdateFrmDay = new Select(dr.findElement(By.name("fromDay")));
	     drpdateFrmDay.selectByVisibleText("18");
	    
	     Select drpToPort = new Select(dr.findElement(By.name("toPort")));
	     drpToPort.selectByVisibleText("Frankfurt");
	     
	     Select drpdateToMonth = new Select(dr.findElement(By.name("toMonth")));
	     drpdateToMonth.selectByVisibleText("March");
	     
	     Select drpdateToDay = new Select(dr.findElement(By.name("toDay")));
	     drpdateToDay.selectByVisibleText("19");
	     
	     
	     //Preferences
	     
	     
	     dr.findElement(By.xpath("//input[1][@value='Business']")).click();
	     
	     Select drpAirline = new Select(dr.findElement(By.name("airline")));
	     drpAirline.selectByVisibleText("No Preference");
	     
	     dr.findElement(By.xpath("//input[@name='findFlights']")).click();
	     
	     
	     
	     
	     
	     //Second Page : Select Flight
	     
	     //-----------Depart------------------------*****************
	     
	     
	     dr.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
	   
	     
	     
	   //-----------Return------------------------*****************
	     
	     dr.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']")).click();
	     
	     dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	     
	     
	     
	   //Third Page : Book a Flight
	     
	     //Passengers
	     
	     dr.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("mercury");
	     dr.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("mercury");
	     
	     Select drMeal = new Select(dr.findElement(By.name("pass.0.meal")));
	     drMeal.selectByVisibleText("Bland");
	   
	     //Credit Card
	     
	     Select drpCardType = new Select(dr.findElement(By.name("creditCard")));
	     drpCardType.selectByVisibleText("MasterCard");
	     
	     dr.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("mercury");
	     
	     
	     Select drpExprMonth = new Select(dr.findElement(By.name("cc_exp_dt_mn")));
	     drpExprMonth.selectByVisibleText("08");
	     
	     Select drpExprYear = new Select(dr.findElement(By.name("cc_exp_dt_yr")));
	     drpExprYear.selectByVisibleText("2010");
	     
	     
	     dr.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("mercury");
	     dr.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("mercury");
	     dr.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("mercury");
	     
	     dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
	     
	     
	     
	     //Flight Confirmation Page
	     
	     dr.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
	     dr.close();
	     
		
	}

}
