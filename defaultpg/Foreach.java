package defaultpg;

public class Foreach {

	public static void main(String[] args) {
		int arr[]= {5,6,7,8,9};
		
		for( int x : arr) {   //foreach loop
			System.out.println(x);
		}
		
		for(int i=0; i<arr.length;i++)
			System.out.println(arr[i]);  // array Print Type

	}

}
