/*********************One Dimension Array**************
 * Declare an array
 * add values into array
 * find size of an array
 * read single value from an array
 * read all values from an array
*/


package arrayListPack;


public class ArraySingleDimensional {

	public static void main(String[] args) {
		
//		Declaring the array
//		int[] arr = new int[9];
//		
//		arr[0]=100;
//		arr[1]=200;
//		arr[2]=300;
//		arr[3]=400;
//		arr[4]=500;
//		arr[5]=600;
		
		int arr[]= {10,20,30,40,50,60};
		
		
		
//	    find size of an array
		System.out.println("length of array" + arr.length);
		
//		read single value from an array
		System.out.println(arr[3]);

//		read all values from an array	
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elements of index " + i + ":"+ arr[i]);
			
		}
		
		
//  Enhanced for loop/ For.. each loop
		
		for (int i : arr) {
			System.out.println("Elements of index " + i );
		}
	
	
	
	}

}
