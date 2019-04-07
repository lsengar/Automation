package files.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfile {

	public static void main(String[] args) throws IOException, InterruptedException
	
	{
		
		//Right click on objecRepo.proeprtiesd file and take the location of path 
	FileInputStream file = new FileInputStream("C:\\10-02-2019 Selenium\\BasicCoreJava\\src\\files\\properties\\objectRepo.properties");
	Properties or = new Properties();
	or.load(file);
	
	System.out.println(or.getProperty("username"));
	System.out.println(or.getProperty("password"));
	System.out.println(or.getProperty("login"));
	//Thread.sleep(4000);
	
	

	}

}
