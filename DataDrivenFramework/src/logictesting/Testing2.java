package logictesting;

public class Testing2 {

	public static void main(String[] args) 
	
	{
		System.out.println(System.getProperty("user.dir"));
		
		String str = "C:\\10-02-2019 Selenium\\DataDrivenFramework"+"\\BrowserDriver\\chromedriver.exe";
		
		String str2 = System.getProperty("user.dir")+"\\BrowserDriver\\chromedriver.exe";
		
		System.out.println(str);
		System.out.println(str2);

	}

}
