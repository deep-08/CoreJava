package arrayListPack;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
			int a[] = {200,100,400,300,500};
			char c[]= {'A','B','C','D','E'};
	
			for (int i = a.length - 1; i >= 0; i--) { // length is act as number of array elements
				System.out.println(a[i]); // i is act as index of array elements
				System.out.println(i);
			}

			Arrays.sort(a);
			System.out.println("Sorted" + Arrays.toString(a));
			
	
	
	}

}
