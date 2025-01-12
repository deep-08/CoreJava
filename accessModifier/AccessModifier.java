/***********Access Modifiers************
 * Access Modifiers - defines scope of variable and methods.
 * 1.public- Scope level we can outside of the class & package.
 * 2.protected- Scope level we can access package outside of package with using inheritance
 * 3.default- Scope level within the package
 * 4.private- Scope level within the class. 
 * 
*/

package accessModifier;
import accessModifier.defaultmodifier.DefaultModifier;

public class AccessModifier {
	
	public static void main(String[] args) {
		Private pvt = new Private();
		
		System.out.println(pvt.a);
		pvt.name(); // private access within the class scope.
		
		

	}

}
