package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 

{
	
	WebDriver dr=null; //have to intialize 
By username= By.name("userName"); //instance variable
By password= By.name("password");
By login= By.name("login");

//We hve to just change the Values if somethign like ID ,pwd need to be changed.

By registration = By.linkText("REGISTER");

public LoginPage(WebDriver dr)  //its a Constructor and it dont return the Value

{
	this.dr=dr;
}

public String login(String username , String password)//local variabel

{
	dr.findElement(this.username).sendKeys(username);  //local variabel
	dr.findElement(this.password).sendKeys(password);
	dr.findElement(login).click();
	
	return dr.getTitle();
	
	
}


}
