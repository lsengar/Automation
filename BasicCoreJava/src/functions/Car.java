package functions;

public class Car 

{

	String name = "Hexa";
	String model = "SUV";
	int wheels = 4;
	String colour = "white";
	
	public Car(String name , String model1 , int wheels1 , String colour1)
	{
		this.name =name;
		this.model=model1;
		this.wheels = wheels1;
		this.colour= colour1;
		
	}
	
	
	public Car()
	{
		
	}
	
	public static void drive()
	
	{
	//	Car c = new Car();
		//System.out.println("The "+c.name+" car of model "+c.model+"xyz have "+c.wheels+"4 wheels and in red "+c.colour+"");
	}
	
	public void transport()
	
	{
	System.out.println("The "+name+" car transport passengers from Pune to Mumbai ");	
		
	}
	
	public void specification()
	
	{
		System.out.println("The "+name+" car of model "+model+"xyz have "+wheels+"4 wheels and in red "+colour+"");
	}
	
}
