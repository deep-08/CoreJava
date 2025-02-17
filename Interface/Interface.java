/**********************Interface****************
 * 1. static we can't access with object.
 * 2. Abstract method can access only with object.
*/



package Interface;

interface shape{
	int height=10; // default it will takes static method
	int width=20; // default it will takes static method
	void circle(); // Abstract method but in access specifier is public.
	
    default void square() {
		System.out.println("this is square"); 
	}
    static void rectangle() {
		System.out.println("this is rectangle");
	}
}
public class Interface implements shape
{
	  public void circle() {
		System.out.println("this is circle - abstract method");
    	}
	 int x,y ;
	 
			
		
public static void main(String[] args) {
	
	//Scenario 1.

	Interface idInterface = new Interface();
	idInterface.x=10;
	idInterface.y=11;
	System.out.println(idInterface.x + idInterface.y);
	
	
	idInterface.circle();			// abstract method
	idInterface.square();
	// default
	shape.rectangle();// Italic method can directly access from interface.
	
	
	shape shShape = new Interface(); // Interface variable can access with object the Class.
	
	shShape.circle();
	
	System.out.println(shape.height * shape.width); // Static variable can access with interface name.
}
}