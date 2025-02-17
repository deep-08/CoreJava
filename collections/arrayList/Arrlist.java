/**************ArrayList***********
 *   --Its class which is implemented list interface.
 * 1. Heterogenious data -allowed
 * 2. Insertion order - preserved <we can add elements inbetween list..>
 * 3. Duplicate elements -- allowed
 * 4. Multiple nulls -- allowed.
 * 
*/

package collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class Arrlist {

	public static void main(String[] args) {
		
		//Declaration
//		 ArrayList<Integer> rtArrayList= new ArrayList<Integer>();
		
			List lis1=new ArrayList();
		
	    // Create an ArrayList with different types of elements
	        ArrayList<Object> myList = new ArrayList<Object>();
	        
	        // Add elements to the ArrayList
	        myList.add(null); // Adds null
	        myList.add(true); // Adds Boolean value
	        myList.add(1);    // Adds Integer value
	        myList.add(null); // Adds another null
	        myList.add("Ashame"); // Adds a String
	        myList.add("Ashame"); // Adds a String
	        myList.add('A');  // Adds a Character
	        myList.add(null); // Adds another null
	        myList.add(null); // Adds another null
	        myList.add(100203003443893L); // Adds a Long value
	        myList.add(239.93); // Adds a Double value
	
	        // Print the size of the ArrayList
	        System.out.println("Initial ArrayList size: " + myList.size());
	
	        // Print the ArrayList elements
	        System.out.println("ArrayList elements: " + myList);
	        
	        // Add an element at a specific index (inserting 500 at index 2)
	        myList.add(2, 500);
	        System.out.println("After adding 500 at index 2: " + myList);
	        
	        // Add another element at a different index (inserting "Hello" at index 4)
	        myList.add(4, "Hello");
	        System.out.println("After adding 'Hello' at index 4: " + myList);
	        
	        // Print the updated size of the ArrayList
	        System.out.println("Updated ArrayList size: " + myList.size());
	
	        // Print the updated ArrayList elements
	        System.out.println("Updated ArrayList elements: " + myList);
	        
	        // Remove the index 4 element in list
	        myList.remove(4);
	        System.out.println("After remove the index 4: " + myList);
	        
	        //Replace element in list
	        myList.set(3, "Hi");
	        System.out.println("After modified or replace the element in the index 3: " + myList);
	        
	        // Access the element in list
	        myList.get(3);
	        
	        //Reading all the elements from arrayList 
	        		//Three methods
	        
	        //Method 1:
	        
	        	for (int i = 0; i < myList.size(); i++) {
					myList.get(i);
				}
	        	
	        //Method 2:
	        	for (Object x : myList) {
	        		System.out.println(x);
				}
	        	
	        //Method 3: Iterator
	        	Iterator<Object> itIterator = myList.iterator();
	        	
	        	while (itIterator.hasNext()) {
				System.out.println(itIterator.next());					}
	        	
	        //Removeall the elements from array list
	        	
	        	ArrayList myList2 = new ArrayList();
	        	
	        	myList2.add(myList);
	        	
	       //Clear the elements in arraylist
	        	myList2.clear();
	        	
	       //Check the arraylist is empty
	        System.out.println(myList2.isEmpty());	
}

}
