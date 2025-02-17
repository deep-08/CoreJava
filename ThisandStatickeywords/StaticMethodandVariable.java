/**********************Static Methods & Static Variables*****************
 * If we has unique value or methods.
 * we don't have to do duplicate the value & methods
 * 

 * 1. Static Variable & method also access value without Object.
 * 2. Static Static Variable & method also access non static value with Object.
 *
*/




package ThisandStatickeywords;

public class StaticMethodandVariable {
		static int a=10;
		int b = 30;
		static String c ="Deepak";
		
		//Static method
		static void m1() { 
			System.out.println("m1 static method");
		}
		
		//Non Static method
		static void m2() {
			System.out.println("m2 non static method");
		}
		void m() {
			System.out.println("m3 non static method");
			m2(); // we can call already defined method inside another method.
			m1();
		}
		
/*		Class Test{
		Static String s = "Wellcome";
	}
	
	Test.s.length(); // Test is class && s is variable && length() method predefined in string. 
	
	Class System{
		Static Printstream out;
	}
	System.out.println(); // System is class & out is variable && println method belongs to Printstrem;
	
*/
		public static void main(String[] args) {			
				System.out.println(a); // Only global variable we can access without object.
				m1(); // we can also method also.
				m2();
				StaticMethodandVariable.c.length();
				
						
				StaticMethodandVariable stat = new StaticMethodandVariable();
				System.out.println(stat.b); // non static global Variable need an object
				
				stat.m();
				stat.m2();
	}

}


