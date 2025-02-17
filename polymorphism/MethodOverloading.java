/****4 rules are applicable.
// *    1. Method name should be same
// *    2. Number of parameter should be different  
// *    3. Data type of parameter should be diffferent
// *    4. Order of parmeters should be different	
*******/
package polymorphism;

public class MethodOverloading {

	int a = 10, b = 2;

	void sum() {
		System.out.println(a + b);
	}

	void sum(int x, int y) {
		System.out.println(x + y);
	}

	void sum(int x, double y) {
		System.out.println(x + y);
	}

	void sum(double x, double y) {
		System.out.println(x + y);

	}

	void sum(double x, int y) {
		System.out.println(x + y);

	}

	void sum(int x, int y, int z) {
		System.out.println(x + y + z);
	}

}
