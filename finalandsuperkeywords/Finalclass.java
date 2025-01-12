/****************Final****************
 * Variables- value of variables cannot change(Constant)
 * Methods - arguments or implements are cannot change (Constant)
 * Methods are not allowed to override.
 * Class - Cannot inherit to next class. (Constant)
 * 			//final class Test1{
						void m() {
							System.out.println("This method from test 1");
						}
						
					}
					
					class Test2 extends Test1{ // error will appear
						void m() {
							System.out.println("This method from test 2");
						}
					}
*/


package finalandsuperkeywords;

class Final{
	final int x = 200; // fixed it has final
}

class Test1{
	void m() {
		System.out.println("This method from test 1");
	}
	
}

class Test2 extends Test1{
	  void m() {
		System.out.println("This method from test 2");
	}
}

class Test3 extends Test2{
//	void m() {                             we can't do this after set the method final.
//		System.out.println("djdkad");
//	}
}

public class Finalclass {
	
	public static void main(String[] args) {
		Final tFinal = new Final();
		
		System.out.println(tFinal.x);
//		tFinal.x = 100;  ----->          We can't change this variable it final.
		System.out.println(tFinal.x);

	}

}
