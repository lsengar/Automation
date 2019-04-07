package Assignment;

public class Q1 {

	public static void main(String[] args) 
	{
		
		
		//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		//{System.out.println(cars[0]);}
		
		//cars[0] = "Opel";
		//{System.out.println(cars[0]);}
		//{System.out.println(cars.length);}
		
		//For Loop
		
		//for (int i=0;i<cars.length;i++)
		//	{System.out.println(cars[i]);}
		
		//For Each Loop
		
		//for (String i:cars)
		//{System.out.println(i);}
		//Multidimensional Arrays
		
		//int [][] mynumbers = {{1,2,3,4},{5,6,7}};
		//int x= mynumbers[0][0];
		//System.out.println(x);
		
		
		int [][] mynumbers = {{1,2,3,4},{5,6,7}};
		
		for (int i=0;i<mynumbers.length;i++)
			
		{
			for (int j=0;j<mynumbers[i].length;j++)
			{System.out.println(mynumbers[i][j]);}
		}
		
		
		
		
	}
}

