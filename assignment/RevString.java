package assignment;

public class RevString {

	public static void main(String[] args) {
//		String s= "Deepak";
//		String rev=" ";
//		for (int i = s.length()-1; i >=0; i--) { // length() is method. it will the elements in the char
//		 rev = rev+s.charAt(i);
//		}
//		System.out.println(" Reversed" + rev);
		
//		Approach 2 - without using string class
		
		String s= "Deepak";
		String rev=" ";
		char a[] = s.toCharArray();
		
		for (int i = a.length-1; i>=0; i--) {
			rev += a[i];
		}
		System.out.println("rev string" + rev);
	}

}
