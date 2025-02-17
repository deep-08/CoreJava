package collections.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HaashSet {

    public static void main(String[] args) {
    
        HashSet myset = new HashSet();
        
        // Add elements to the set
        myset.add(100);
        myset.add(null);
        myset.add(null); // duplicate null, will be ignored
        myset.add(10.3);
        myset.add("Even");
        myset.add("Odd");
        myset.add("Unemployment");
        myset.add(12020393290292L);
        myset.add(10239032.34);
        myset.add(100); // duplicate 100, will be ignored
        
        // Print size and the set itself
        System.out.println("Size of HashSet: " + myset.size());
        System.out.println("HashSet: " + myset);
        
        // Remove an element
        myset.remove(10239032.34);
        System.out.println("HashSet after removal: " + myset);
        
        // Convert HashSet to ArrayList for easy access
        ArrayList lt = new ArrayList(myset);
        System.out.println("ArrayList: " + lt);
        
        // Read all elements using a for-each loop
        for (Object x : lt) {
            System.out.println(x);
        }
        
       // Using Iterator:
        Iterator iterator = lt.iterator();
        
        while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
    }
  }
