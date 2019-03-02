import java.util.*;
public class ifelsecondition {

	public static void main(String[] args)
	
	{
	int i;
	System.out.println("Entert the Number :-");
	Scanner obj = new Scanner(System.in);
	i=obj.nextInt();
	
	if (i==1)
	{
		System.out.println("Select Model of BMW");
		int j=obj.nextInt();
		if (j==1)
		{
			System.out.println("B1");
		}
		else if (j==2)
		{
			System.out.println("B2");
				
		}
		else
		{
			System.out.println("Wrong Model Number");
		}
	}
	
	else if (i==2)
	{
		System.out.println("Select Model of AUDI");
		int j=obj.nextInt();
		
		if (j==1)
		{
			System.out.println("A1");
		}
		else if (j==2)
		{
			System.out.println("A2");
				
		}
		else
		{
			System.out.println("Wrong Model Number");
		}
			
		
	}
	
	else
	{
		System.out.println("You entered wrong number");
	}
	

	}

}
