package assignment;

public class PalindromeinString {

	public static void main(String[] args) {
		String a = "Level"; // Remember if attending interview give upper case sensitive;
		String rev = "";
		char cString[] = a.toCharArray(); // it will char cString[] = {'L','e','v','e','l'} 
		// It important concept when ur reverse the string one by one character.
		
//		 Otherwise i should declare like this char gnl[] = {'L','E','V','E','L'} 
		
		for (int i = a.length()-1; i >= 0; i--) {
			rev = rev + cString[i];
		}
		System.out.println(rev);
		
		if (rev.equalsIgnoreCase(a)) {
			System.out.println("Its Palindrome");
		}
		else {
			System.out.println("Its not Palindrome");
		}
	}

}
