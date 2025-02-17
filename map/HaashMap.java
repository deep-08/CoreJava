/***********HashMap***********
 * 	A class implemented map interface..
 *    syn:	Key= Value 
 * 	  Pair: ID = 102
 * 1. Data can be stored in the form of Pairs: key, value
 * 2. Key is unique. But we can have duplicate values.
 * 3. Insertion order not preserved (Index not allowed). 
 * 
*/

package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HaashMap {

	public static void main(String[] args) {
		//Declaration
//		HashMap hMap = new HashMap();
//		Map hMap1= new HashMap();
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		// Adding pairs
		
		hMap.put(101,"Leki");
		hMap.put(102,"Miski");
		hMap.put(102,"Leki");
		hMap.put(104,"Miki");
		hMap.put(105,"liki");
		hMap.put(106,"Akki");
		hMap.put(106,null);
		hMap.put(106,null);
		
		System.out.println(hMap);
		System.out.println(hMap.size());
		
		
		
		//Remove pair
		hMap.remove(102);
		System.out.println(hMap);
		
		System.out.println(hMap.keySet()); // Keyset() is method get only keys
		System.out.println(hMap.values()); // values() is method get only values
		System.out.println(hMap.entrySet()); // entrySet() is method get pairs
		
		//read the all data in map
		for (Map.Entry<Integer,String> entry : hMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}		
		
	}

}
