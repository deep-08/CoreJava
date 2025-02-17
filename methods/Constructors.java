/******************Constructor*******
 * 1. constructor initial value.
 * 2. Constructor is executed at the time object creation
 * 3. invoked when the object is created
 * 4. Constructor name same name as class.
 * 5. To create an object new keyword must existing constructor of that class.
 * If a Class doesn't have any constructors created by a programmer their will be constructor given by compiler.
 * 
*/


package methods;

public class Constructors {
	 String Nickname;
	 String famName;
	 String sidehustle;
	 String proficient;
	 String rnk;
	 String rank;
	 int x,y;
		//Using Constuctor
		 Constructors(int id, String m, int i) { //Parameterized Constructor
			 Nickname = famName;
			 sidehustle = proficient;
			 rnk = rank;
			 id=1;
		}
		 
/* Two type of Constructor
		 1. Parameterized Constructor
		 2. Default or Non Parameterized
*/
		 
		 
		 // Default Constructor
		  Constructors() {
			x=100;
			y=200;
		}
		 
		  //Parameterized constructor
		  Constructors(int a,int b){
			  a=x;
			  b=y;
         }
		  void sum() {
			  System.out.println(x+y);
		  }
		public static void main(String args[]) {
			 Constructors var = new Constructors();
			 Constructors var1 = new Constructors(10,20);
			 var.sum();
			 var1.sum();
		}
}
