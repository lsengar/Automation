import java.util.*;
public class SwitchExample {

	public static void main(String[] args) 
	
	{
		int i,no1,no2,cal;
		
		do{
		System.out.println("1.Add\n2.Sub\n3.Mul");
		System.out.println("Enter your Choice:-");
		Scanner obj=new Scanner(System.in);
		i=obj.nextInt();

		switch(i)
		{
		case 1:
			System.out.println("Enter two numbers : -");
			no1=obj.nextInt();
			no2=obj.nextInt();
			cal=no1+no2;
			System.out.println("Addition:-"+cal);
			break;
			
		case 2:
			System.out.println("Enter two numbers : -");
			no1=obj.nextInt();
			no2=obj.nextInt();
			cal=no1-no2;
			System.out.println("Subtraction:-"+cal);
			break;
			
		case 3:
			System.out.println("Enter two numbers : -");
			no1=obj.nextInt();
			no2=obj.nextInt();
			cal=no1*no2;
			System.out.println("Multiplication:-"+cal);
			
			break;
			default:
				System.out.println("You entered wrong choice");
				break;
				
		} 
		}while(i<=3);
	}

}
