/****************Jumpingstatement************
 * 1.Break
 * 2.Continue
*/

package jumpingstatement;

public class Jumpint2statement {
	
	public static void main(String[]args) {
		for (int i = 1; i <=10; i++) {
			if (i==5 || i==3 || i==9) {
				continue; // It will continue the interation(loop) again initialize state. 
//				break; it break the loop.
			}
			System.out.println(i);
		}
		
	}

}
