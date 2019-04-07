package oops.Exceptions;

import java.io.File;
import java.io.IOException;

public class FileException {

	public static void main(String[] args) throws IOException 
	
	{
		//Create a Folder
		/*File fileobject = new File ("C://Users//Lokesh//Desktop//GCREDDY1");
		fileobject.mkdir();
		*/
		//Check the Existence of a Folder
		
		/*File fileobject = new File ("C://Users//Lokesh//Desktop//GCREDDY1");
		boolean a = fileobject.exists();
		
		if (a == true)
		{	System.out.println("Folder Exists");
		
		}
		
		else 
		{
			System.out.println("Folder not exists");
		}*/
		
		//Delete a Folder
		/*File fileobject = new File ("C://Users//Lokesh//Desktop//GCREDDY1");
		fileobject.delete();
		*/
		
		File fileobject = new File ("C://Users//Lokesh//Desktop//lok.txt");
		fileobject.createNewFile();
		
		
		
	}

}
