/*************Constructor***************
 * 1. Constructor is cannot be static.
 * 2. Eiether its should be parameterized or non paremeterized
*/
package polymorphism;

public class ConstructorOverloading {
	
	    double width, height , depth, length;
		public ConstructorOverloading() {
			width = 20;
			height = 20;
			depth = 20;
		}
		
		ConstructorOverloading(double w, double h, double i, double j){
			width =w;
			height = h;
			depth = i;
			length = j;
		}
		ConstructorOverloading(double s){
			depth = height + width;
		}
		double volume() {
			return length * width * height;
		}
}
