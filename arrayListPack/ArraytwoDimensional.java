/*********************Two Dimension Array**************
 * Declare an array
 * add values into array
 * find size of an array
 * read single value from an array
 * read all values from an array
*/
package arrayListPack;


public class ArraytwoDimensional {

	public static void main(String[] args) {
//		Declaring the ArraytwoDimensional
//		
//		int arr[][]= new int[5][5];
//		arr[0][0]=100;
//		arr[0][1]=100;
//		arr[0][2]=100;
//		arr[0][3]=100;
//		arr[0][4]=100;
//		arr[0][5]=100;
		
		
		int arr[][] = {
				{100,200,300},
				{300,400,500},
				{500,600,700}
		};
		
		
//		System.out.println(arr.length);
//		System.out.println(arr[2].length); // find the column size arr[2] mention size
//
////	read single value from an array
//		System.out.println(arr[1][2]);
		
		
//		read all values from an array
		
		for (int r= 0; r <=arr.length-1; r++) {
			for (int c = 0; c <=arr.length-1; c++) {
				System.out.print(arr[r][c]+ " ");
			}
			System.out.println();
		}
		
		
		
		for (int arr1[] : arr) {
			for (int x : arr1) // arr1 contains 3 values of array in single row
			{
				System.out.print(x + " ");
			}
			System.out.println();
		}

	}

}
