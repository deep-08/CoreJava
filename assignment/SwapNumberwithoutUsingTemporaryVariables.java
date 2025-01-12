package assignment;


public class SwapNumberwithoutUsingTemporaryVariables {

	public static void main(String[] args) {
		
		// with using temp var
		
		int c=3, d=6;
		int temp;
		System.out.println("Beforeswapping " + c);
		System.out.println("Beforeswapping " + d);
		temp=3;
		c=d;
		d=temp;
		System.out.println(c);
		System.out.println(d);
		
		
		
		int a =4, b = 6;
        // Swap using bitwise XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
        
	}

}

