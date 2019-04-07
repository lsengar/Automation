package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module1 
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test 1");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test 1");
	}
	
	@BeforeClass
	public void beforeClass()
	
	{
		System.out.println("M1 before class");
	}

	
	@AfterClass
	public void afterClass()
	
	{
		System.out.println("M1 after class");
	}
	
		@BeforeMethod
		public void beforeMethod()
		
		{
			System.out.println("M1 before Method");
		}
		
		@AfterMethod
		public void AfterMethod()
		
		{
			System.out.println("M1 After Method");
		}
		
		@Test(priority=1)
	 public void test1()
	 
	 {
		 System.out.println("M1 test1");
	 }
	 
		@Test(priority=0)
	 public void test2()
	 
	 {
		 System.out.println("M1 test2");
	 }
	 
		@Test(priority=2)
	 public void test3()
	 
	 {
		 System.out.println("M1 test3");
	 }
	 
		@Test(priority=3)
	 public void test4()
	 
	 {
		 System.out.println("M1 test4");
		 
	 }
		
	}
