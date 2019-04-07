package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module2 

{
	
	@BeforeClass
	public void beforeClass()
	
	{
		System.out.println("M2 before class");
	}

	
	@AfterClass
	public void afterClass()
	
	{
		System.out.println("M2 after class");
	}
	
		@BeforeMethod
		public void beforeMethod()
		
		{
			System.out.println("M2 before Method");
		}
		
		@AfterMethod
		public void AfterMethod()
		
		{
			System.out.println("M2 After Method");
		}
		
		@Test(priority=1)
	 public void test1()
	 
	 {
		 System.out.println("M2 test1");
	 }
	 
		@Test(priority=0)
	 public void test2()
	 
	 {
		 System.out.println("M2 test2");
	 }
	 
		@Test(priority=2)
	 public void test3()
	 
	 {
		 System.out.println("M2 test3");
	 }
	 
		@Test(priority=3)
	 public void test4()
	 
	 {
		 System.out.println("M2 test4");
		 
	 }
		
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("Before Test 2");
		}
		
		@AfterTest
		public void afterTest()
		{
			System.out.println("after Test 2");
		}
		
		
	}
