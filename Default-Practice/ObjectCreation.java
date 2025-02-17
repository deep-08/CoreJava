/* Object is an instance of class & has its own unique set of attributes (data) and behaviors (methods)
 * Its is physical Entity
 * Occupy space memory
 * we can create multiple obect for single class;
 * car1 = Car("Toyota", "Corolla")
 *  car2 = Car("Honda", "Civic")
 *  
 */
public class ObjectCreation {

	// Global Variable
		int eid;
		String ename;
		String job;
		int sal;
		
		//Methods
		void display()// Userdefined Method				
		{
			System.out.println(eid);  // Methods should have contains the variable or call method
			System.out.println(ename);// we can't create sub method inside a supredent method.
			System.out.println(job);
			System.out.println(sal);
		}

		public static void main(String[] args) {
			
			ObjectCreation ob = new ObjectCreation();
			
			// Object Instance of class.
			ClassCreation emp1 = new ClassCreation(); // Initialize object - It contains the attributes of class variables
			emp1.eid=101;
			emp1.ename="Deepak";
			emp1.job="Tester";
			emp1.sal=300000;
			emp1.display();    //Calling Method
			
			ClassCreation emp2= new ClassCreation();
			emp2.eid = 102;
			emp2.ename = "Aswin";
			emp2.job = "Developer";
			emp2.sal=600000;
			emp2.display();

	   }

}
