package oops.abstraction;

public class BankUser {

	public static void main(String[] args) 
	
	{
	
		RBI obj;   //User defined data type
		
		
		 obj = new HDFC();
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
		obj =new ICICI();
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
		obj = new PNB();
		obj.moneyTransfer();
		obj.loan();
		obj.internetBanking();
		
	}

}
