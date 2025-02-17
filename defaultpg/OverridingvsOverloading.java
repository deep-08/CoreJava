/**************Overiding vs Overloading************
 * Method Overriding:
 * 1. Possible only in multiple classes (inheritance)
 * 2. We should Not the change the method name but body we should change.
 * 3. Method names are same. 
 * 4. Belongs to inheritance
 * 
 * Method Overloading:
 * 1. Possible if we had single class.
 * 2. We should not change the method name but arguments or return data type should change.
 * 3. Method name are same.
 * 4. Belongs to Polymorphism.
 * 
*/



package defaultpg;

class Mayir{
	void count(int a) {
		System.out.println(a);
	}
}

class Manda extends Mayir{
	void count(double b) {
		System.out.println(b); // Method Overload we change argument or dataType of arguments.
	}
}

class sotta extends Manda{
	void count(double a) {
		System.out.println(a*a);  //Method Override because we change only implementation here not method name or argument
	}
	int display() {
		return 40;
	}
}



public class OverridingvsOverloading {

	public static void main(String[] args) {
			sotta objSotta = new sotta();
			objSotta.count(2);
			Manda obManda = new Manda();
			obManda.count(3);
	}

}
