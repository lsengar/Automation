import java.util.Scanner;


public class EvenNumbers {
	private static Scanner sc;

	public static void main(String[] args) 
	
	{
		int number,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number  :  ");
		number=sc.nextInt();
		
		for (i=1;i<=number;i++)
		{
			if (i%2 ==0)
				System.out.println(i+"\t");
		}


	}

}
