package oops.Exceptions;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) 
	
	{
		//Scanner scan = new Scanner(System.in);
		//String s1= "12";
		//String s2 = "14";
		//int a = Integer.parseInt(s1);
		//int b = Integer.parseInt(s2);
		//System.out.println(a+b);
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Read two number :- ");
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		//System.out.println(s1+s2);
		System.out.println(a+b);*/
		
		int a=10;
		int b=0;
		
		try{
		
		int result = a/b;
		System.out.println(result);
		}catch (ArithmeticException A){
			
			System.out.println("Divide by Zero Error");	
		}
		
		
		
		System.out.println("hello java");
		System.out.println("hello selenium");
		
		
		int c[]= new int [4];
		
		try{
		c[7] = 100;
		System.out.println(c[7]);}catch (ArrayIndexOutOfBoundsException Ar1) {
		System.out.println("ArrayIndexOutOfBoundsException Error");
		}
		
		
		System.out.println("hello selenium");
	}
}


