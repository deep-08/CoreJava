/****************Inheritance***************
 * Aquiring all the properties (variables) & behaviours(method) from one class to another class.
 * 
 * Objectives:
 * 	1. re-usability
 * 	2. Avoid duplication
 *
 * Types:
 * 1. Single
 * 2. multi level
 * 3. hierachy
 * 4. multiple
*/

package inheritance;

	class A {
		int a = 100;
	
		void display() {
			System.out.println(a);
		}
	}
	
	class B extends A {
		int b = 200;
	
		void print() {
			System.out.println(b);
		}
	}

public class SingleInheritanceClass {

	public static void main(String[] args) {
			
		B deep = new B();
		
		deep.display();
		deep.print();
		System.out.println(deep.a);
		
	}

}
