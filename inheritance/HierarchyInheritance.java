package inheritance;

class X{
		int a =123;
		void display() {
			System.out.println("allow");
		}
	}
	
	class Y extends X{
		int b = 321;
		void print() {
			System.out.println("them");
		}
	}
	
	class Z extends X {
		int c = 312;
		void show() {
			System.out.println("inside");
		}
		
	class U extends Y{
		int t = 3;
		void few() {
			System.out.println(t);
		}
	}
}
public class HierarchyInheritance {

	public static void main(String[] args) {
		Z hierachyInheritance = new Z();
		
		hierachyInheritance.notify();
		hierachyInheritance.display();
		hierachyInheritance.show(); // Print method is not extends to Z.
	}

}
