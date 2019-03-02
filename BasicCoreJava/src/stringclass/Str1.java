package stringclass;

public class Str1 {

	public static void main(String[] args)
	
	{
		
		String str = "anand bhayre";
		
		//Length
		
		System.out.println(str.length());
		
		//trim
		System.out.println(str.trim());
		
		
		//Char At
		System.out.println(str.charAt(4));

		//Sub String
		//String str2 = str.substring(beginIndex, endIndex)
		//String str2 = str.substring(6,12);
		
		String str2 = str.substring(6);
				System.out.println(str2);
				
				String str4= "  anand  ";
				String str6 = str4.trim();
				String str5=str6.substring(0);
				System.out.println(str5);
				
				
		        //Replace
				String str7=str.replace(" ", "");

				System.out.println(str7);
				
				//Split
				String[] arr=str.split(" ");
				
				int l=arr.length;
				System.out.println(l);
				
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				
				//Equal & EqualIgnoreCase
				String a="Anand";
				
				String b="anand";

				System.out.println(a.equals(b));
				System.out.println(a.equalsIgnoreCase(b));
				
				if(a.equals(b))
				
				{System.out.println("Strings are matched");}
				
				else
				{
					System.out.print("Strings are not matched");
				}
				
				
				
				
				/*
				String number100 = "anand";
				int count123 = 0;
				for (int l = 0; l < number100.length(); l++)
				    if (number.charAt(l) == 'a')
				        count123++;*/
			
				//System.out.println(count123);
				
				
				
				String str14= "anand";
				/*System.out.println(str9.length());
				
				String str10=str9.replace("a", "");
				
				System.out.println(str10.length());
				
				System.out.println(str9.length()-str10.length());*/
				
				System.out.print(str14.length()-(str14.replace("a", "")).length());


	
				
	}

}
