/*  Linear Search method
 *  Searching value one by one
*/


package arrayListPack;


public class SearchElementsInArray {

	public static void main(String[] args) {
			int a[]= {10,20,30,40,50,50};
			int searchEmt=40;
			
			boolean status = false;
			
			for (int i = 0; i < a.length; i++) {
				if (a[i]==searchEmt) {
					System.out.println("Found");
					status = true;
				}
			}				//We need stop the loop when value is found. Other wise loop will continue after finding also.
			if (!status) {
				
			System.out.println("Not found");
			}
			
			
//			for (int i : a) {
//				if (searchEmt==i) {
//					System.out.println(i);
//				}
			
	}

}
