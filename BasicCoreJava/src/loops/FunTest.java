package loops;

import functions.AccessModifiers;

public class FunTest extends AccessModifiers{

	public static void main(String[] args) 
	
	{
	
		AccessModifiers fun = new AccessModifiers();
		
		fun.publicfun();
		
		FunTest test = new FunTest();
		test.protectedfun();
				
	}

}
