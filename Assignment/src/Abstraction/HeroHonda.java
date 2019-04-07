package Abstraction;

/**
 * @author Lokesh
 *
 */
public abstract class HeroHonda extends Bike 

{
	/*@Override
	public void handle() 
	{System.out.println("Bikes have Handle");}

	@Override
	public void seat()
	{System.out.println("Bikes have Seat");}
	
	public static void main (String[] args)
	{
		HeroHonda obj = new HeroHonda();
		obj.engine();
		obj.handle();
		obj.seat();
	}
*/
	
	public static void main (String[] args)
	{
		HeroHonda obj = new HeroHonda();
		obj.engine();
		obj.handle();
		obj.seat();
	}
}
