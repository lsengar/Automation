package exceptions;

import java.io.FileInputStream;

import oops.abstraction.HDFC;

public class LearnException2 {

	public static void main(String[] args)
	
	{
	
		int a=10;
		int b=20;
		
		try{
		System.out.println(a/b);
		HDFC b1=new HDFC();
		//HDFC b1= null;
		b1.demonetization();
		
		//FileInputStream file = new FileInputStream("dsddd");
		
		throw new Error ("Testing Error");
		
		
		}catch(ArithmeticException e)
		{
		System.out.println(e.getMessage());
		}
		
		catch(RuntimeException e)
		{
		System.out.println(e.getMessage());
		}
		
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		catch(Throwable e)
		{
		System.out.println(e.getMessage());
		}
		System.out.println("Testing");
	}

}
