package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnException {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException 
	
	{
		
		int a= 10;
		int b=0;
		System.out.println(a/b);
		
		FileInputStream file = new FileInputStream("");
		Thread.sleep(2000);
		
	}

}


//Exceptions are the events that occurs during exeution of program and disturbs the normal flow of execution


//Error   - NOn REcoverable Errors

//Excpetion : REcoverable Errors

//Excpetion are of two types : Checked and Unchecked 

//Checked : SQL ,IO ,Nullpointer exception

//Uncheck : Array ,String out of Bound Exception ,null point 


//Try Catch or Throws Keyword