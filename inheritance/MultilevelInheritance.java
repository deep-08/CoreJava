package inheritance;


	class J{
		int a =123;
		void display() {
			System.out.println("allow");
		}
	}
	
	class K extends J{
		int b = 321;
		void print() {
			System.out.println("them");
		}
	}
	
	class L extends K {
		int c = 312;
		void show() {
			System.out.println("inside");
		}
	}

public class MultilevelInheritance {

	public static void main(String[] args) {
		L inheritanceL = new L();
		
		System.out.println(inheritanceL.a);
		inheritanceL.show();
		inheritanceL.print();

	}

}
