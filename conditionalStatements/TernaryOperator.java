package conditionalStatements;

public class TernaryOperator {

	public static void main(String[] args) {

//		var = exp ? result : result 2;

//		int a =200, b = 100;
//		int x = (a<b)? a:b;
//		System.out.println(x);

//		int y= (1==1)?100:200;
//		System.out.println(y);

		int personAge = 20;
		String reString = (personAge > 18) ? "eligible" : "Not eligible";
		System.out.println(reString);

//	-- Swap Variables--
		int a = 10, b = 20;
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swaping a = " + a + ", b = " + b);

	}

}