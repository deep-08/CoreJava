package arrayListPack;

import java.util.Arrays;

public class SortingElementsinArray {

	public static void main(String[] args) {
		int arr[]= {1,3,2,7,5,4,6};
				
		System.out.println("Bubble Sorting");
		System.out.println(Arrays.toString(arr)); // Arrays.toString(arr) Arrays-Predefined arrays.Method
		
		Arrays.sort(arr);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr)); 
								//if we not give here toString method print time it will return hashcode.	
	}

}


/* Arrays - Predefined class;
 * toString() - method;
 * sort() - method;
 */