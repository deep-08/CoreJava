package assignment;

public class LargestNumberin3values {

	public static void main(String[] args) {
		int a = 10, b=5 , c =15;
		
		if ((a>b)&&(a>15)) {
			System.out.println("a is largest");
		}
		else if ((b>a)&&(b>c)) {
			System.out.println("b is largest");
		}
		else {
			System.out.println("c is largest");
		}
		
		// Ternary Operator 
		int x=3, y= 5;
		int z = (x>y)? 3:5;
		System.out.println(z);
		
		if (x>y) {
			System.out.println("Largest value is " + x);
		}
		else {
			System.out.println("Larges value is " + y);
		}
	
	}

}
