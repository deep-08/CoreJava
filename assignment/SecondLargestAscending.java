package assignment;


public class SecondLargestAscending {

	public static void main(String[] args) {
		int arr[]= {20,50,80,30,40,10};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
				}
				}
		
		
		System.out.println("Array in ascending: ");
		
		for (int i : arr) {
			System.out.println(i + " ");
		}
		System.out.println("Second the largest number" + arr[arr.length-2]);
		}
		
	}


