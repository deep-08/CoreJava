/******************Arithmetic Operator********************
 * ****************Compound Assignment********************
 * ****************Increment/Decrement****************** */
package defaultpg;

public class Arithmetic_Operators {

	public static void main(String[] args) {
//		+ - * / %
		int a=1, b = 2,c;
		c=a+b;// Standard Assignment
		a= a+3; // Compound Assignment
		
		a++; // Post Increment
		++a; // Pre Increment
		
		a--; //Post Decrement
		--a; //Pre Decrement
		
		c= ++a;
		
		System.out.println(c);
	}

}
