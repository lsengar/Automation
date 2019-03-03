package variablesanddatatypes;

public class Testing {

	public static void main(String[] args) 
	{	
		
		//First Method of Declaring Array
		int a[]; //Create Array
		a=new int[3];//Define Size
		
		//Second way of declaring array --> int [] a = new int[3];
		
		//Third Method of Declaring Array
		//dataType [] arrayName = {value1,value2,value3};
		
		//int [] a = {10,20,30};
		
		a[0] = 10;//Assign a Value
		a[1] = 20;
		a[2] = 30;
		//a[3] = 40;//Run Time Error
System.out.println(a[0]+a[1]);
System.out.println(a[2]);
	}

}
