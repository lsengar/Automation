
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float first = 1.20f , second = 2.45f;
		System.out.println("---Before Swap----");
		System.out.println("First Number =  " + first);
		System.out.println("Second Number =  " + second);
		
		float temporary = first;
		first = second;
		second = temporary;
		
		
//		first = first - second;
//        second = first + second;
//        first = second - first;
		
		System.out.println("---After Swap----");
		System.out.println("First Number =  " + first);
		System.out.println("Second Number =  " + second);
		
	}
	

}
