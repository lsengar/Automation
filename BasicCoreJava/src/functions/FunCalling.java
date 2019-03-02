package functions;

public class FunCalling {

	public static void main(String[] args) 
	
	{
	Functions.sum(10,30);	
Functions.multiply(10, 20);

Functions obj = new Functions();
int a= obj.interestcalculator(10000, 8, 10);
System.out.println(a);

int b = obj.mod(20, 10);
System.out.println(b);

AccessModifiers fun = new AccessModifers();
fun.publicfun();
fun.protectedfun();
fun.noaccessmodfun();


//cant call Mod and Interst calculator as they are not static
	}

}


//Calling Static functions of other class can be done by using its Class Name


//Static functionc can only calll Static methods and Static Variables

//To call Non static functions and methods we have to create an instance of that particuylar class

//Types of Access Modifiers :
/*Public - Throuhgout the Project
Private - Within the Calss
Protected - Within the Package and by using Child Class we can acces it outside the Package also
Default - Within the Package*/