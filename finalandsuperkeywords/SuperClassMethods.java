/************SuperKeywords************
 * Super Keywords will be used to invoke the immediate parent class variable
 * Super Keywords will be used to invoke the immediate parent class Methods.
 * 
*/

package finalandsuperkeywords;

public class SuperClassMethods {

	String colorString = "White";
	
	void cat() {
		System.out.println("1."+ "Pussy");
	}
}

class Dog extends SuperClassMethods{
	String colorString = "Black";
	String cat="meow";
	
	void display() {
		System.out.println("2."+ super.colorString);
	}
	
	 void cat() {
		System.out.println("3." + "Boots");
		System.out.println("4" +this.cat); 
	}
}