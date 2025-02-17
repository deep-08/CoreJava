/* ********************Methods**************
 * A group of statements which will perform certain task.
 * To invoke the method. we have call the method through object.

 * 1. User defined Methods
 * 2. BuildIn Methods.

	  BuildIn Methods
    1. String s = new String("deepak");
	2. s.length();
	  User defined Methods
	1. No Parameter No return value
	2. No Parameter  with return value
	3. with Parameter No return value
	4. with Parameter with return value 
 * 
*/
package methods;

public class MethodsCreation {
	
//	1. No Parameter(arguments) No return value 
	void m1(){
		System.out.println("hello");
	}
	
//	2. No Parameter  with return value
	String m2(){ //return type is not should be void
		return("How are you..?"); 
	}
	
//	3. with Parameter No return value
	void m3(String name){
		System.out.println("Hi"+ name);
	}
	
//	4. with Parameter with return value
	String m4(String name){
		return("Hello " +name);
	}

}
