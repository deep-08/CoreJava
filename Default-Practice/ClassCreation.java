/* Class is BluePrint of Object or collection of attributes(properties) and its behavior(functions)
 * Class is legal Entity
 * will not occupy space memory.
 *  class Car:
    def __init__(self, brand, model):
        self.brand = brand
        self.model = model

    def drive(self):
        print(f"The {self.brand} {self.model} is driving.")
*/

public class ClassCreation{
	
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
		
		ClassCreation emp1 = new ClassCreation(); // Instance of an Object.
		emp1.eid=101;
		emp1.ename="Deepak";
		emp1.job="Tester";
		emp1.sal=300000;
		emp1.display();
		
		ClassCreation emp2= new ClassCreation();
		emp2.eid = 102;
		emp2.ename = "Aswin";
		emp2.job = "Developer";
		emp2.sal=600000;
		emp2.display();

   }
}
