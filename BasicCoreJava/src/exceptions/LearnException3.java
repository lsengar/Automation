package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnException3 {

	public static void main(String[] args) throws FileNotFoundException
	
	{
	
		file("aada");
	}
	
	public static void file(String filepath) throws FileNotFoundException
	{
		FileInputStream file = new FileInputStream(filepath);
	}
	

}



///when not sure use Throw keyword

//else if we are sure use Try Catch