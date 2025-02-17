/**********Array********************
 * Array is collection of elements of same data type.(Homogeneous data). We can store multiple values into a single variables.  
*/


package arrayListPack;

import java.util.ArrayList;


public class ArrayListDemo {

	public static  void main(String[] args) {
//		ArrayList<Integer>myList = new ArrayList<Integer>(); // Homogenious ArrayList (We are using wrapper class) Decleration
		ArrayList myList2 = new ArrayList(); // Hetrogenious Arraylist Decleration
//		List myList3 = new ArrayList();
		
		myList2.add(100);		// Adding data into arraylist
		myList2.add(10.5);
		myList2.add("Deepak");
		myList2.add('A');
		myList2.add(true);
		myList2.add(1.5f);
		myList2.add(null);
		myList2.add(null);
		myList2.add(2,2.5);  // Insertion Order. Inserting an element in middle of array list.
		
		System.out.println("Size of ArrayList " + myList2.size());  // Size of ArrayList
		System.out.println("Size of ArrayList" + myList2);  // Print my List
		
		myList2.remove(5);  // Remove element from ArrayList
		System.out.println("After remove element " + myList2.indexOf(10.5)); // Find element index of array list
		
		myList2.set(7, "Mohan"); // Modify the ArrayList.
		System.out.println("After replace a index of (7)" + myList2);
		
		myList2.get(3); // Access Specific element from arraylist
		System.out.println(myList2.get(3));
		
		
		
		
		

	}

}
